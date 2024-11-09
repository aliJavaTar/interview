package com.recursive;

public class PowerTwo {

    // 8 / 2 = 4 | 4 / 2 = 2 | 2 / 2 = 1
    // 6 / 2 = 3 !

    public static boolean isPowerOfTwo(int number) {
        if (number == 0)
            return false;

        while (number != 1) {
            if (number % 2 != 0)
                return false;
            number /= 2;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(128));
        System.out.println(isPowerOfTwo(6));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(0));
    }
}
