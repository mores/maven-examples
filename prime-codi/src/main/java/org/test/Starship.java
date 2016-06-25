package org.test;

import javax.inject.Inject;

class Starship { // We want to test this!
 
  @Inject
  WarpDrive engine;
 
  void start() {
    System.out.println( "Starship - start" );
    engine.start();
  }
}
