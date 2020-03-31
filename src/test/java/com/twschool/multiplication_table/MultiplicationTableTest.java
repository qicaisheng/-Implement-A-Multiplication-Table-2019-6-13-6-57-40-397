package com.twschool.multiplication_table;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

}
