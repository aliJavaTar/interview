package com.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SumTest {

    @Test
    void calculateSum() {
        var sum = new Sum();
        int result = sum.calculate(6);
        Assertions.assertThat(result).isEqualTo(21);
    }
}