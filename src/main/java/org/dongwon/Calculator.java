package org.dongwon;

public class Calculator {
    public int calculate(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                if (num2 != 0) result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("사칙연산 기호가 아닙니다.");
        }
        return result;
    }
}
