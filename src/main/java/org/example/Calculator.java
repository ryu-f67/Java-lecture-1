package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
  BigDecimal firstNumber;
  BigDecimal secondNumber;
  String operator;

  public Calculator(BigDecimal firstNumber, BigDecimal secondNumber, String operator) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.operator = operator;
  }

  public void add() {
    BigDecimal result = firstNumber.add(secondNumber);
    System.out.printf("計算結果: %s %s %s = %s", firstNumber, operator, secondNumber, result);
  }

  public void subtract() {
    BigDecimal result = firstNumber.subtract(secondNumber);
    System.out.printf("計算結果: %s %s %s = %s", firstNumber, operator, secondNumber, result);
  }

  public void multiply() {
    BigDecimal result = firstNumber.multiply(secondNumber);
    System.out.printf("計算結果: %s %s %s = %s", firstNumber, operator, secondNumber, result);
  }

  public void divide() {
    try {
      //　計算機の使用用途が定まっていないため、現段階ではスケールを5に設定
      BigDecimal result = firstNumber.divide(secondNumber, 5, RoundingMode.HALF_UP);
      result = result.stripTrailingZeros();
      System.out.printf("計算結果: %s %s %s = %s", firstNumber, operator, secondNumber, result);
    } catch (ArithmeticException e) {  // ゼロ除算が発生した場合の処理
      System.out.println("ゼロ除算エラーです。");
    }
  }

  public void output() {
    switch (operator) {
      case "+" -> add();
      case "-" -> subtract();
      case "*" -> multiply();
      case "/" -> divide();
    }
  }
}
