package com.diffblue.javatest;

import java.util.Stack;

public class Calc {
  public enum MathsOperators {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE,
    POWER,
    CONCAT,
    NEXT,
  }

  static int polish(MathsOperators[] operations) {
    int nextVal = 3;
    Stack<Integer> stack = new Stack<Integer>();
    stack.push(1);
    stack.push(2);
    for (MathsOperators o : operations) {
      if (o == MathsOperators.NEXT) {
        stack.push(nextVal);
        nextVal += 1;
        continue;
      }
      Integer a = stack.pop();
      Integer b = stack.pop();
      switch (o) {
        case ADD:
          stack.push(a + b);
          break;
        case SUBTRACT:
          stack.push(a - b);
          break;
        case MULTIPLY:
          stack.push(a * b);
          break;
        case DIVIDE:
          stack.push(a / b);
          break;
        case POWER:
          stack.push(a ^ b);
          break;
        case CONCAT:
          if (a < 10 && a >= 0) {
            stack.push(10 * a + b);
          } else {
            throw new RuntimeException("Tried to concatenate " + a + " and " + b);
          }
          break;
      }
    }
    if (nextVal != 10) {
      throw new RuntimeException("Error, we require 7 NEXT statements; got " + nextVal);
    }
    if (stack.size() != 1) {
      throw new RuntimeException("The stack should end just 1 item long; got " + stack.size());
    }
    return stack.pop();
  }
}
