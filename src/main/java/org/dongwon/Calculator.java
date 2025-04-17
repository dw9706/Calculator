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
                else throw new IllegalArgumentException("나눗셈 연산 시 두번째 숫자는 0이 아니어야 합니다.");
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                throw new IllegalArgumentException("사칙연산 기호가 아닙니다.");
        }

        return result;
    }
}
