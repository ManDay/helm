package com.github.manday.helm;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

class MainActivity : Activity() {
 override fun onCreate(savedInstanceState:Bundle?) {
  super.onCreate(savedInstanceState);
  val output = TextView(this);
  this.setContentView(output);
  output.setText("This is a te[xs]t");
 }
}
