package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }
    @Test
    public void testSum1 () {
        int actual = sumCalculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSum3 () {
        int actual = sumCalculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSum6 () {
        int actual = sumCalculator.sum(6);
        int expected = 21;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSum10 () {
        int actual = sumCalculator.sum(10);
        int expected = 55;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testSum56 () {
        int actual = sumCalculator.sum(21);
        int expected = 231;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testIllegalArgumentException0 () {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> sumCalculator.sum(0));
    }



}