package com.diffblue.javatest;

public class Calc {
  static int div(int a, int b) {
    return a / b;
  }

  /*
   * Takes a maths question as a string like "1+2*3" and returns the sum as an int, e.g. 7
   *
   * As of 2019-04-08, no coverage is generated, not even trivial "1" => 1
   */
  static int calc(String str)
  {
    int index;

    index = str.lastIndexOf('+');
    if (index != -1) {
      return calc(str.substring(0,index)) + calc(str.substring(index + 1));
    }

    index = str.lastIndexOf('-');
    if (index != -1) {
      return calc(str.substring(0,index)) - calc(str.substring(index + 1));
    }

    index = str.lastIndexOf('/');
    if (index != -1) {
      return calc(str.substring(0,index)) / calc(str.substring(index + 1));
    }

    index = str.lastIndexOf('*');
    if (index != -1) {
      return calc(str.substring(0,index)) * calc(str.substring(index + 1));
    }

    return Integer.parseInt(str);
  }
}
