package com.github.manday.helm;

import android.os.Bundle;
import androidx.activity.ComponentActivity;

class PreferencesActivity : ComponentActivity() {
 override fun onCreate( savedInstanceState : Bundle? ) {
  super.onCreate( savedInstanceState );
  setContent {
   Text( "Hello Helm!" )
  }
 }
}
