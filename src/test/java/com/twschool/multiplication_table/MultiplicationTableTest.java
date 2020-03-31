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
}
