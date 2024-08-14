package org.example;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Input {

  public static BigDecimal entryFirstNumber(Scanner scanner) {
    do {
      try {
        System.out.print("1つ目の数字を入力してください。 : ");
        return scanner.nextBigDecimal();
      } catch (InputMismatchException e) {
        System.out.println("数字以外が入力されました。");
        scanner.nextLine();
      }
    } while(true);
  }

  public static BigDecimal entrySecondNumber(Scanner scanner) {
    do {
      try {
        System.out.print("2つ目の数字を入力してください。 : ");
        return scanner.nextBigDecimal();
      } catch (InputMismatchException e) {
        System.out.println("数字以外が入力されました。");
        scanner.nextLine();
      }
    } while(true);
  }

  public static String entryOperator(Scanner scanner) {
    do {
      System.out.print("演算子を入力してください。(+, -, *, /) : ");
      String operator = scanner.next();
      if (Objects.equals(operator, "+") || Objects.equals(operator, "-") || Objects.equals(operator, "*") || Objects.equals(operator, "/")) {
        return operator;
      }
      System.out.println("(+, -, *, /) 以外が入力されました。");
    } while (true);
  }
}
