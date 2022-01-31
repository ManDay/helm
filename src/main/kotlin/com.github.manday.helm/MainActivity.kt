package com.github.manday.helm;

import android.os.Bundle;
import android.app.Activity;
import	android.content.Intent;
import android.widget.TextView;

class MainActivity : Activity() {
 const val OPEN_DOCUMENT_TREE: Int = 1;
 
 override fun onActivityResult( requestCode:Int, resultCode:Int, resultData:Intent? ) {
  if (requestCode==OPEN_DOCUMENT_TREE && resultCode==Activity.RESULT_OK ) {
  }
 }

 override fun onCreate(savedInstanceState:Bundle?) {
  super.onCreate(savedInstanceState);
  val output = TextView(this);
  this.setContentView(output);
  output.setText("This is a te[xs]t");
 }
}
