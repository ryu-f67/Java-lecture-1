package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    BigDecimal firstNumber = Input.entryFirstNumber(scanner);
    String operator = Input.entryOperator(scanner);
    BigDecimal secondNumber = Input.entrySecondNumber(scanner);

    Calculator calculator = new Calculator(firstNumber, secondNumber, operator);
    calculator.output();
    scanner.close();
  }
}
