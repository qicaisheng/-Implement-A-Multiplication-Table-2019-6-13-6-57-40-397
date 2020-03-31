package com.twschool.multiplication_table;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {

    @Test
    void should_check_input_format() {
        assertTrue(MultiplicationTable.check(2, 2));
        assertTrue(MultiplicationTable.check(2, 4));
        assertFalse(MultiplicationTable.check(4, 2));
        
        assertFalse (MultiplicationTable.check(0, 2));
        assertTrue(MultiplicationTable.check(2, 1000));
        assertFalse(MultiplicationTable.check(2, 1001));
    }

    @Test
    void should_return_sequences_between_to_valid_numbers() {
        List<Integer> actual = MultiplicationTable.sequencesBetween(1, 3);
        
        assertEquals(3, actual.size());
        assertEquals(Integer.valueOf(1), actual.get(0));
        assertEquals(Integer.valueOf(2), actual.get(1));
        assertEquals(Integer.valueOf(3), actual.get(2));
    }

    @Test
    void should_return_multiple_conditions() {
        assertEquals("2*3=6", MultiplicationTable.generateMultipleConditions(2, 3));
        assertEquals("3*4=12", MultiplicationTable.generateMultipleConditions(3, 4));
    }

    @Test
    void should_return_multiplication_row() {
        assertEquals("2*2=4", MultiplicationTable.generateMultipleRow(2, 2));
        assertEquals("2*3=6  3*3=9", MultiplicationTable.generateMultipleRow(2, 3));
        assertEquals("2*4=8  3*4=12  4*4=16", MultiplicationTable.generateMultipleRow(2, 4));
    }

    @Test
    void should_return_multiplication_table() {
        assertEquals("2*2=4\n2*3=6  3*3=9\n2*4=8  3*4=12  4*4=16", MultiplicationTable.generateMultipleTable(2, 4));
    }
}
