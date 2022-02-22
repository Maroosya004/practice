package by.practice.maria.calculator;

import by.practice.maria.calculator.Calculator;

public class Main {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 8;
        String sign = "-";
        int result = 0;
        boolean isCalculated = true;
        Calculator calculator = new Calculator();
        switch (sign) {
            case "+":
                result = calculator.sumNumbers(firstNumber,secondNumber);
                break;
            case "-":
                result = calculator.subtractNumbers(firstNumber, secondNumber);
                break;
            case "*":
                result = calculator.multiplyNumbers(firstNumber, secondNumber);
                break;
            case "/":
                result = calculator.divideNumbers(firstNumber, secondNumber);
                break;
            default:
                isCalculated = false;
        }
        if (isCalculated) {
            System.out.println(firstNumber + sign + secondNumber + "=" + result);
        } else {
            System.out.println("Unknown sign " + sign);
        }
    }
}
