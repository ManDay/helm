package com.github.manday.helm;

import android.app.Application;
import android.os.Bundle;
import androidx.compose.runtime.mutableStateListOf

class Helm: Application() {
 val layoutRepository = mutableStateListOf<Layout>( );
 override fun onCreate( ) {
  super.onCreate( );
 }
}

