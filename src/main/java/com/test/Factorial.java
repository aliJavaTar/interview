package com.test;

public class Factorial {
    public int calculate(int number) {

        int result = 1;
        for (int index = 1; index <= number; index++) {
            result *= index;
        }
        return result;
    }

    public int calculate_r(int number) {
         if (number == 1) {
             return 1;
         }
         return number * calculate(number - 1);
    }
}
