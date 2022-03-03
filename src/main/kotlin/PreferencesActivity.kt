package com.github.manday.helm;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.setContent;

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
import androidx.compose.material.icons.filled;
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class PreferencesActivity : ComponentActivity() {
 override fun onCreate( savedInstanceState : Bundle? ) {
  super.onCreate( savedInstanceState );
  setContent {
   PreferencesComposable( )
  }
 }
}

@Composable
private fun DrawerComposable( ){
  Column( modifier = Modifier.verticalScroll( rememberScrollState( ) ) ){
    Button( null ){
      Row( ){
        Icon( Icons.Filled.ViewList,"Layouts" )
        Text( "Layouts" )
      }
    }
    Button( null ){
      Row( ){
        Icon( Icons.Filled.AspectRatio,"Geometry" )
        Text( "Geometry" )
      }
    }
  }
}

@Composable
private fun PreferencesComposable( ) {
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
          IconButton(
            onClick = { }
          ) {
            Icon( Icons.Filled.Menu,"Menu")
          }
        }
      )
    },
    floatingActionButtonPosition = FabPosition.End,
    floatingActionButton = {
      ExtendedFloatingActionButton(
        icon = { Icon( Icons.Filled.FolderZip,"Zip File" ) },
        text = { Text( "Load" ) }
      )
    },
    content = {
      innerPadding -> LazyColumn(contentPadding = innerPadding) {
        items(count = 100) {
          Box( Modifier.fillMaxWidth().height(50.dp).background(myColors.surface) )
        }
      }
    }
  )
}
