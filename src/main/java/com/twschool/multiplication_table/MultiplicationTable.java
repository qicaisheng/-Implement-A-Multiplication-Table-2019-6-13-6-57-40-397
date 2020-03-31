package com.twschool.multiplication_table;

public class MultiplicationTable {
    public static boolean check(int firstNumber, int secondNumber) {
        if (firstNumber > 1000 || firstNumber < 1) {
            return false;
        }
        if (secondNumber > 1000 || secondNumber < 1) {
            return false;
        }
        return firstNumber <= secondNumber;
    }
}
