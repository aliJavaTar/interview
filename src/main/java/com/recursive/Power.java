package com.recursive;

public class Power {

    public static int powerOf(int number, int powerOf) {
        int result = 1;

        for (int i = 0; i < powerOf; i++) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(powerOf(2, 4));
    }
}
