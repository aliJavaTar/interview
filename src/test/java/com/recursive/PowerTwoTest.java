package com.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTwoTest {

    @Test
    void isPowerTwo() {
        var powerTwo = new PowerTwo();
        boolean isValid = powerTwo.IsPowerTwo(2);
        Assertions.assertThat(isValid).isTrue();

        var powerTwo1 = new PowerTwo();
        boolean isValid1 = powerTwo1.IsPowerTwo(3);
        Assertions.assertThat(isValid1).isFalse();

        var powerTwo2 = new PowerTwo();
        boolean isValid2 = powerTwo2.IsPowerTwo(128);
        Assertions.assertThat(isValid2).isTrue();

        var powerTwo3 = new PowerTwo();
        boolean isValid3 = powerTwo3.IsPowerTwo(6);
        Assertions.assertThat(isValid3).isFalse();

        var powerTwo4 = new PowerTwo();
        boolean isValid4 = powerTwo4.IsPowerTwo(0);
        Assertions.assertThat(isValid4).isFalse();
    }
}