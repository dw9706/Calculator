package org.dongwon;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();
        while (true) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                // nextInt()를 호출하면 개행문자가 남아 String을 받아 Integer로 파싱.
                double num1 = Double.parseDouble(sc.nextLine());

                System.out.print("두 번째 숫자를 입력하세요: ");
                double num2 = Double.parseDouble(sc.nextLine());

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operation = sc.nextLine().trim().charAt(0);

                Number result = calculator.calculate(num1, num2, operation);
                System.out.println("결과: " + result);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            String exit = sc.nextLine().trim();
            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
