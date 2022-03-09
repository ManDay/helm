package com.github.manday.helm;

import android.app.Application;
import android.os.Bundle;
import androidx.compose.runtime.mutableStateListOf

class Helm: Application() {
 var layoutRepository : SnapshotListOf<Layout>? = null;
 override fun onCreate( ) {
  super.onCreate( );
  this.layoutRepository = mutableStateListOf<Layout>( );
 }
}

