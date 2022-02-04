package com.github.manday.helm;

import android.os.Bundle;
import androidx.fragment.app;

class Preferences : FragmentActivity() {
 override fun onCreate( savedInstanceState : Bundle? ) {
  super.onCreate( savedInstanceState );
  getSupportFragmentManager().beginTransaction().replace( R.id.settings_container,PreferencesFragment() ).commit()

  this.setContentView(output);
 }
}
