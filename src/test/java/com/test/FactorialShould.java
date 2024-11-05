package com.test;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialShould {

    @Test
    void calculate_value_of_factorial() {
        var fact = new Factorial();

        int result = fact.calculate_r(5);

        assertThat(result).isEqualTo(120);
    }
}