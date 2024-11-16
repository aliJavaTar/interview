package com.recursive;


//The maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)

//Input : price[] =  { 3 , 5, 8, 9, 10, 17}
//Output : 18
//Explanation : Rod length is 7 And if the prices are as follows.
//        length   | 1   2   3   4   5   6
//        ————————
//price    | 3   4   6   7  9  10
//The maximum obtainable value is 18 (by making 6 pieces each of length 1)

//Input : price[] =  { 3 }
//Output : 3
//Explanation: There is only 1 way to pick a piece of length 1
public class RodCutting {

//Input : price[] =  { 1 , 5, 8, 9, 10, 17 , 17 . 20}
//Output : 22
//length   | 1   2   3   4   5   6   7   8
//        ——————————
//price    | 1   5   8   9  10  17  17  20


    public int getMostPrice(int[] price) {
        return cutRode(price, price.length);
    }

    private int cutRode(int[] price, int length) {
        if (length == 0) return 0;
        int maxPrice = 0;
        for (int index = 0; index < length; index++) {
            int currentPrice = price[index] + cutRode(price, length - index - 1);
            maxPrice = Math.max(maxPrice, currentPrice);
        }
        return maxPrice;
    }

    //[ 1 meter , 2.................]
    //price [ 2 , .................]


}

