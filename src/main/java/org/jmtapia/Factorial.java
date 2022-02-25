package org.jmtapia;

/**
 * Class providing a methhod thath computes the factorial
 * of an integer number
 *
 * @author Jose M. Tapia
 */

public class Factorial {
    public int compute(int value) {
        if (value < 0) {
            throw new RuntimeException("The value is negative: " + value);
        }
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        return result;
    }
}
