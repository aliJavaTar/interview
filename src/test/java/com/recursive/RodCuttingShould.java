package com.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RodCuttingShould {
    @Test
    void cutting_up_the_rod_and_selling_the_pieces() {
        int[] prices = { 1 , 5, 8, 9, 10, 17 , 17 , 20};
        var rodCutting = new RodCutting(prices);
        int result = rodCutting.calculate();
        Assertions.assertThat(result).isEqualTo(22);
    }
}

//Input : price[] =  { 1 , 5, 8, 9, 10, 17 , 17 . 20}
//Output : 22
//Explanation : Rod length is 8 and the values of different pieces are given as the following,
//length   | 1   2   3   4   5   6   7   8
//        ——————————
//price    | 1   5   8   9  10  17  17  20
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

