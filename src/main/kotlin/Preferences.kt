package com.github.manday.helm;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

class Preferences : FragmentActivity() {
 override fun onCreate( savedInstanceState : Bundle? ) {
  super.onCreate( savedInstanceState );
  setContentView( R.layout.preferences_activity )
 }
}
