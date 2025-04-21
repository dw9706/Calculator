package org.dongwon;

import java.util.*;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
    private Queue<Number> results = new LinkedList<>();

    public Number calculate(T num1, T num2, char operation) {
        Number result;
        double num1Double = num1.doubleValue();
        double num2Double = num2.doubleValue();

        OperatorType operatorType = OperatorType.of(operation);
        switch (operatorType) {
            case ADD:
                result = num1Double + num2Double;
                break;
            case MINUS:
                result = num1Double - num2Double;
                break;
            case DIVIDE:
                if (num2Double != 0.0) result = num1Double / num2Double;
                else throw new IllegalArgumentException("나눗셈 연산 시 두번째 숫자는 0이 아니어야 합니다.");
                break;
            case MULTI:
                result = num1Double * num2Double;
                break;
            default:
                throw new IllegalArgumentException("사칙연산 기호가 아닙니다.");
        }
        results.offer(result);
        return result;
    }

    public void removeResult() {
        results.poll();
    }

    public Queue<Number> getResults() {
        return results;
    }

    public void setResults(Queue<Number> results) {
        this.results = results;
    }

    public void printResultsLessThan(Number number) {
        List<Number> resultLessThan = results.stream().filter(n -> number.doubleValue() > n.doubleValue()).toList();
        System.out.println(resultLessThan);
    }

}
