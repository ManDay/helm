package com.github.manday.helm;

import android.app.Application;
import android.os.Bundle;
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList

class Helm: Application() {
 var layoutRepository : SnapshotStateList<Layout>?
 override fun onCreate( ) {
  super.onCreate( );
  this.layoutRepository = mutableStateListOf<Layout>( );
 }
}

