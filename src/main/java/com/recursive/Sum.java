package com.recursive;

public class Sum {
 //    public int calculate(int number) {
//        if (number == 0)
//            return 0;
//        return number + calculate(number - 1);
//    }


    public int calculate(int number) {
        if (number == 1)
            return 0;
        return number % 10 + calculate(number / 10);
    }
}
