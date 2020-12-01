package com.ntsan.calculator;

import java.util.Scanner;

public class Calculator {

    int addition(int x, int y) {
        int result = x + y;
        return result;
    }

    int minus(int x, int y) {
        int result = x - y;
        return result;
    }

    int division(int x, int y) {
        int result = x / y;
        return result;
    }

    int multiplication(int x, int y) {
        int result = x * y;
        return result;
    }

    void run() {
        boolean enabled = true;
        while (enabled) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to console calculator");
            System.out.println("Please enter first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Please enter second number: ");
            int secondNumber = scanner.nextInt();
            System.out.println("Please choose the operation: ");
            String symbol = scanner.next();

            int result;
            switch (symbol) {
                case "+":
                    result = addition(firstNumber, secondNumber);
                    System.out.println("The result is: " + result);
                    break;
                case "-":
                    result = minus(firstNumber, secondNumber);
                    System.out.println("The result is: " + result);
                    break;
                case "/":
                    result = division(firstNumber, secondNumber);
                    System.out.println("The result is: " + result);
                    break;
                case "*":
                    result = multiplication(firstNumber, secondNumber);
                    System.out.println("The result is: " + result);
                    break;
            }
            System.out.println("Do you want to continue?");
            System.out.println("Y/N");
            String wantToContinue = scanner.next();
            if (wantToContinue.equalsIgnoreCase("N")) {
                enabled = false;
            } else if (!wantToContinue.equals("Y")) {
                System.out.println("Wrong symbol entered. PROGRAM WILL EXIT");
                System.exit(0);
            }
        }
    }
}
