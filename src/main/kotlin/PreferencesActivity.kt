package com.github.manday.helm;

import kotlinx.coroutines.launch

import android.os.Bundle;

import androidx.activity.ComponentActivity;
import androidx.activity.compose.setContent;
import androidx.activity.contextaware.*;
import android.content.Context;

import androidx.compose.runtime.Composable;
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Button
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.FabPosition
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*;
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class PreferencesActivity: ComponentActivity() {
  override fun onCreate( savedInstanceState: Bundle? ) {
    super.onCreate( savedInstanceState );
    addOnContextAvailableListener {
      object: OnContextAvailableListener {
        override fun onContextAvailable( context: Context ) {
          setContent {
            PreferencesComposable( context.getApplicationContext() as Helm )
          }
        }
      }
    }
  }
}

@Composable
private fun DrawerComposable( ){
  Column( modifier = Modifier.verticalScroll( rememberScrollState( ) ) ){
    Button( { } ){
      Row( ){
        Icon( Icons.Filled.List,"Layouts" )
        Text( "Layouts" )
      }
    }
    Button( { } ){
      Row( ){
        Icon( Icons.Filled.Close,"Geometry" )
        Text( "Geometry" )
      }
    }
  }
}

@Composable
private fun PreferencesComposable( helm: Helm ) {
  val layoutRepository = helm.layoutRepository
  val myColors = MaterialTheme.colors
  val scaffoldState = rememberScaffoldState()
  val scope = rememberCoroutineScope()

  Scaffold(
    scaffoldState = scaffoldState,
    drawerContent = { DrawerComposable( ) },
    topBar = {
      TopAppBar(
        title = { Text("Helm") },
        navigationIcon = {
          IconButton( onClick = { scope.launch { scaffoldState.drawerState.open( ) } } ) {
            Icon( Icons.Filled.Menu,"Menu")
          }
        }
      )
    },
    floatingActionButtonPosition = FabPosition.End,
    floatingActionButton = {
      ExtendedFloatingActionButton(
        onClick = { },
        icon = { Icon( Icons.Filled.AddCircle,"Zip File" ) },
        text = { Text( "Load" ) }
      )
    },
    content = {
      innerPadding -> LazyColumn(contentPadding = innerPadding) {
				layoutRepository.forEach { Text( it.id ) }
      }
    }
  )
}
