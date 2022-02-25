package org.jmtapia;

public class Factorial {
    public int compute(int value) {
        int result;
        if (value < 0){
            throw new RuntimeException("The value is negative: " + value);
        }
        if (value == 0 || value ==1){
            result = 1;
        } else {
            result = compute(value - 1) * value;
        }
        return result;
    }
}
