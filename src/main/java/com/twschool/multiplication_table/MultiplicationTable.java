package com.twschool.multiplication_table;

public class MultiplicationTable {
    public static boolean check(int firstNumber, int secondNumber) {
        if (outRangOfOneToThousand(firstNumber)) {
            return false;
        }
        if (outRangOfOneToThousand(secondNumber)) {
            return false;
        }
        return firstNumber <= secondNumber;
    }

    private static boolean outRangOfOneToThousand(int value) {
        return value > 1000 || value < 1;
    }
}
