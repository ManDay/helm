package com.github.manday.helm;

import android.app.Application;
import android.os.Bundle;

class Helm: Application() {
 val layoutRepository : LayoutRepository;
 override fun onCreate( ) {
  super.onCreate( );
  this.layoutRepository = LayoutRepository( );
 }
}

