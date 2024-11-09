package com.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PowerShould {

    @ParameterizedTest
    @CsvSource({"2,3,8", "2,1,2" })
    void calculatePower(int firstInput, int secondInput, int expectedOutput) {
        var power = new Power();
        int result = power.calculate_D(firstInput, secondInput);
        Assertions.assertThat(result).isEqualTo(expectedOutput);
    }
}