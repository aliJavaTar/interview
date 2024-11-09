package com.recursive;

public class Power {

    public static int powerOf(int number, int powerOf) {
        int result = 1;


        for (int i = 0; i < powerOf; i++) {
            result *= number;
        }

        return result;
    }
    public int calculate(int number, int powerOf) {
        if (powerOf == 0)
            return 1;

        return number * calculate(number, powerOf - 1);
    }
    public int calculate_D(int number, int powerOf) {
        if (powerOf == 0)
            return 1;
        else if (powerOf == 1) {
            return number;
        }

        int result = calculate_D(number, powerOf / 2);

        if (powerOf % 2 == 0)
            return result * result;
        else
            return result * result * number;
        }
}
