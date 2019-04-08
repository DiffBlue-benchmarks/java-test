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

  /*
   * As above, but restricted to addition
   *
   * Still no coverage
   */
  public static int calcAdditionOnly(String str)
  {
    int index;

    index = str.lastIndexOf('+');
    if (index != -1) {
      return calc(str.substring(0,index)) + calc(str.substring(index + 1));
    }

    return Integer.parseInt(str);
  }

  /*
   * As above, but only takes 0 or 1 '+'
   *
   * Still no coverage
   */
  public static int calcOneLevel(String str)
  {
    int index;

    index = str.lastIndexOf('+');
    if (index != -1) {
      return Integer.parseInt(str.substring(0,index)) + Integer.parseInt(str.substring(index + 1));
    }

    return Integer.parseInt(str);
  }

  /*
   * As above, but only return the LHS of the sum, don't add
   *
   * Still no coverage
   */
  public static int calcLhs(String str)
  {
    int index;

    index = str.lastIndexOf('+');
    if (index != -1) {
      return Integer.parseInt(str.substring(0,index));
    }

    return Integer.parseInt(str);
  }

  /*
   * As above, but only return the LHS of the sum, don't add
   *
   * This does get coverage, both trivial and with a +. This implies the issue is with substr(0, nondet), but substr(nondet) is fine.
   */
  public static int calcRhs(String str)
  {
    int index;

    index = str.lastIndexOf('+');
    if (index != -1) {
      return Integer.parseInt(str.substring(index + 1));
    }

    return Integer.parseInt(str);
  }

  /*
   * Just concatenate strings, don't convert to int
   *
   * This works - both substrs seem fine, with and without a second parameter.
   */
  public static String calcStringOut(String str)
  {
    int index;

    index = str.lastIndexOf('+');
    if (index != -1) {
      return str.substring(0,index) + str.substring(index + 1);
    }

    return str;
  }
}
