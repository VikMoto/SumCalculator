package org.example;

public class SumCalculator {
    public static int sum(int n) {
        int result = 0;
        if (n == 0) {
            throw new IllegalArgumentException("Invalid input argument : " + n);
        } else {

            for (int i = 1; i <= n; i++) {
                result += i;
            }
        }

        return result;
    }
}
