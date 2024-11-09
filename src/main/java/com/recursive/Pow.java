package com.recursive;

public class Pow {
    public static int tesdt(int n, int p) {
        int result = 1;
        for (int index = 0; index < n; index++) {
            result *= p;
        }
        return result;
    }

    public static int tr(int n, int p) {
        if (p < 0)
            throw new IllegalArgumentException("what do you need to input negative?");
        if (p == 0)
            return 1;
        if (p == 1)
            return n;
        return n * tr(n, p - 1);
    }


    public static void main(String[] args) {
        System.out.println(tr(2, 0));
    }
}
