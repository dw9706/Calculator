package org.dongwon;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        // nextInt()를 호출하면 개행문자가 남아 String을 받아 Integer로 파싱.
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("사칙연산 기호를 입력하세요: ");
        char operation = sc.nextLine().trim().charAt(0);

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
