package com.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RodCuttingShould {

    @Test
    void calculate_total_price() {
        var rodCutting = new RodCutting();
        int result = rodCutting.getMostPrice(new int[]{1, 5, 8, 9, 10, 17, 17, 20});
        Assertions.assertThat(result).isEqualTo(22);
    }
}