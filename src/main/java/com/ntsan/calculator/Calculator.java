package com.ntsan.calculator;

import java.util.Scanner;

public class Calculator {

    double addition(double x, double y) {
        return x + y;
    }

    double minus(double x, double y) {
        return x - y;
    }

    double multiplication(double x, double y) {
        return x * y;
    }

    double division(double x, double y) {
        return x / y;
    }

    void run() {
        boolean enabled = true;
        while (enabled) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to console calculator");
            System.out.println("Please enter first number: ");


            double firstNumber = scanner.nextDouble();
            System.out.println("Please enter second number: ");

            double secondNumber = scanner.nextDouble();
            System.out.println("Please choose the operation: ");

            String symbol = scanner.next();

            double result;
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
            } else if (!wantToContinue.equalsIgnoreCase("Y")) {
                System.out.println("Wrong symbol entered. PROGRAM WILL EXIT");
                System.exit(0);
            }
        }
    }
}
