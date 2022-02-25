package org.jmtapia.factorial;

public class Factorial {
    public int compute(int value) {
        int result;
        if (value == 0 || value ==1){
            result = 1;
        } else {
            result = compute(value - 1) * value;
        }
        return result;
    }
}