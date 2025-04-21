package org.dongwon;

public enum OperatorType {
    ADD('+'),
    MINUS('-'),
    DIVIDE('/'),
    MULTI('*');

    private final char operator;

    OperatorType(char operator) {
        this.operator = operator;
    }

    public static OperatorType of(char operator) {
        for (OperatorType value : values()) {
            if(operator == value.operator) return value;
        }
        throw new IllegalArgumentException("지원하지 않는 연산자 입니다. : " + operator);
    }
}
