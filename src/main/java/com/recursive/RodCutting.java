package com.recursive;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RodCutting {
    //        int length = prices.length;
//        int[] dp = new int[length + 1];
//        dp[0] = 0;
//
//        for (int i = 1; i <= length; i++) {
//            int maxVal = Integer.MIN_VALUE;
//
//            for (int j = 0; j < i; j++) {
//                maxVal = Math.max(maxVal, prices[j] + dp[i - j - 1]);
//            }
//
//            dp[i] = maxVal;
//        }
//
//        return dp[length];
    private final int[] prices;

    public RodCutting(int[] prices) {
        this.prices = prices;
    }


    public int calculate() {
        Set<Item> items = new TreeSet<>();
        int maxSize = 0;
        int maxPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            items.add(new Item(prices[i], i + 1));
        }

        for (Item item : items) {
            if (maxSize + item.size() > prices.length) {
                return maxPrice;
            }
            maxSize += item.size();
            maxPrice += item.price();
        }

        return maxPrice;


    }
    // prices
    // length + 1
    //  i {1, 5};
    //  j {1, 5};


}

    /*
     1 meter 1 $
     2 meter 5 $
     3 meter 7 $
     4 meter 7 $
     5 meter 8 $
     */