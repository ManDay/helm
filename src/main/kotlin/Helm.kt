package com.github.manday.helm;

import android.app.Application;
import android.os.Bundle;
import androidx.compose.runtime.mutableStateListOf

class Helm: Application() {
 var layoutRepository : SnapshotStateList<Layout>? = null;
 override fun onCreate( ) {
  super.onCreate( );
  this.layoutRepository = mutableStateListOf<Layout>( );
 }
}

