package com.recursive;

public class PowerTwo {

    // 8 / 2 = 4 | 4 / 2 = 2 | 2 / 2 = 1
    // 6 / 2 = 3 !

    public static boolean isPowerOfTwo(int number) {

        while (number != 1) {
            if (number % 2 != 0)
                return false;
            number /= 2;
        }

        return true;
    }
    public int calculate(int number, int powerOf) {
        if (powerOf == 0)
            return 1;

        return number * calculate(number, powerOf - 1);
    }
}


