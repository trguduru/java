/*
 * Copyright (c) 2011.  Peter Lawrey
 *
 * "THE BEER-WARE LICENSE" (Revision 128)
 * As long as you retain this notice you can do whatever you want with this stuff.
 * If we meet some day, and you think this stuff is worth it, you can buy me a beer in return
 * There is no warranty.
 */

package com.google.code.java.core.classloader;

public class ShortClassLoadingMain {
  public static void main(String... args) {
    System.out.println("Start");
    Class aClass = AClass.class;
    System.out.println("Loaded");
    String s = AClass.ID;
    System.out.println("Initialised");
  }
}

class AClass {
  static final String ID;

  static {
    System.out.println("AClass: Initialising");
    ID = "ID";
  }
}
