package org.jmtapia;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases:
 * factorial 0 -> 1
 * factorial 1 -> 1
 * factorial 2 -> 2
 * factorial 3 -> 6
 * factorial 6 -> 720
 * factorial negative number -> raises an exception
 */

class FactorialTest {

    private Factorial factorial;

    @BeforeEach
    public void setUp(){
        factorial = new Factorial();
    }

    @AfterEach
    public void finish(){
        factorial = null;
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsZero() {
        int expectedValue = 1;
        int obtainedValue = factorial.compute(0);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfTheNumberIsOne() {
        int expectedValue = 1;
        int obtainedValue = factorial.compute(1);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnTwoIfTheNumberIsTwo() {
        int expectedValue = 2;
        int obtainedValue = factorial.compute(2);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturnSixIfTheNumberIsThree() {
        int expectedValue = 6;
        int obtainedValue = factorial.compute(3);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeReturn720IfTheNumberIsSix() {
        int expectedValue = 720;
        int obtainedValue = factorial.compute(6);

        assertEquals(expectedValue,obtainedValue);
    }

    @Test
    public void shouldComputeOfAnNegativeNumberRaiseAnException() {
        assertThrows(RuntimeException.class, () -> factorial.compute(-1));
    }

    @DisplayName("Test de varios numeros negativos")
    @ParameterizedTest(name = "value < 0 raise and exception")
    @ValueSource(ints = { -1, -4, -123, -89})
    public void shouldComputeOfAnNegativeNumberRaiseAnException2(int n) {
        assertTrue(n < 0,"El numero: " + n  + " no es negativo");
        assertThrows(RuntimeException.class, () -> factorial.compute(n));
    }
}