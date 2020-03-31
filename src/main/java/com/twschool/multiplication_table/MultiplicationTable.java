package com.twschool.multiplication_table;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    public static List<Integer> sequencesBetween(int firstNumber, int secondNumber) {
        return IntStream.rangeClosed(firstNumber, secondNumber).boxed().collect(Collectors.toList());
    }

    public static String generateMultipleConditions(int firstNumber, int secondNumber) {
        return String.valueOf(firstNumber) + '*' + secondNumber + "=" + firstNumber * secondNumber;
    }
}
