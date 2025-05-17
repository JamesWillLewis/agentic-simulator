package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testReturnSum() {
        assertEquals(10, Main.returnSum(5,5));
    }
}