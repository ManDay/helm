package com.github.manday.helm;

import android.os.Bundle;
import androidx.preference;

class PreferencesFragment : PreferenceFragmentCompat() {
 override fun onCreatePreferences( savedInstanceState : Bundle?, rootKey : String? ) {
  setPreferencesFromResource( R.xml.preferences, rootKey )
 }
}

