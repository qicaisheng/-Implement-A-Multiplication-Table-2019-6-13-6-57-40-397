package com.twschool.multiplication_table;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationTable {
    public static String generateMultiplicationTable(int firstNumber, int secondNumber) {
        if (!isValidInput(firstNumber, secondNumber)) {
            return null;
        }
        return sequencesBetween(firstNumber, secondNumber).stream()
                .map(number -> generateMultiplicationRow(firstNumber, number))
                .collect(Collectors.joining("\n"));
    }

    static boolean isValidInput(int firstNumber, int secondNumber) {
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

    static List<Integer> sequencesBetween(int firstNumber, int secondNumber) {
        return IntStream.rangeClosed(firstNumber, secondNumber).boxed().collect(Collectors.toList());
    }

    static String generateMultipleConditions(int firstNumber, int secondNumber) {
        return String.valueOf(firstNumber) + '*' + secondNumber + "=" + firstNumber * secondNumber;
    }

    static String generateMultiplicationRow(int firstNumber, int secondNumber) {
        return sequencesBetween(firstNumber, secondNumber).stream()
                .map(number -> generateMultipleConditions(number, secondNumber))
                .collect(Collectors.joining("  "));
    }
}
