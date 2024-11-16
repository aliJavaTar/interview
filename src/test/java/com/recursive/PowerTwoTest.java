package com.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTwoTest {

    @Test
    void isPowerTwo() {

        boolean isValid = PowerTwo.isPowerOfTwo(2);
        Assertions.assertThat(isValid).isTrue();


        boolean isValid1 = PowerTwo.isPowerOfTwo(3);
        Assertions.assertThat(isValid1).isFalse();


        boolean isValid2 =PowerTwo.isPowerOfTwo(128);
        Assertions.assertThat(isValid2).isTrue();


        boolean isValid3 = PowerTwo.isPowerOfTwo(6);
        Assertions.assertThat(isValid3).isFalse();


        boolean isValid4 =PowerTwo.isPowerOfTwo(0);
        Assertions.assertThat(isValid4).isFalse();
    }
}