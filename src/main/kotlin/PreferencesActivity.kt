package com.github.manday.helm;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

class PreferencesActivity : FragmentActivity() {
 override fun onCreate( savedInstanceState : Bundle? ) {
  super.onCreate( savedInstanceState );
  setActionBar( null );
  setContentView( R.layout.preferences_activity )
 }
}
