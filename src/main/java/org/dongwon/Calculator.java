package org.dongwon;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            // nextInt()를 호출하면 개행문자가 남아 String을 받아 Integer로 파싱.
            int num1 = Integer.parseInt(sc.nextLine());

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operation = sc.nextLine().trim().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = Integer.parseInt(sc.nextLine());

            // 연산 로직
            int result = 0;
            boolean isValid = true;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '/':
                    if (num2 != 0) result = num1 / num2;
                    else {
                        isValid = false;
                        System.out.println("나눗셈 연산 시 두번째 숫자는 0이 아니어야 합니다.");
                    }
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                default:
                    isValid = false;
                    System.out.println("사칙연산 기호가 아닙니다.");
            }
            // 예외 상황 시 출력 X
            if (isValid) System.out.println("결과: " + result);

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String exit = sc.nextLine().trim();
            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
