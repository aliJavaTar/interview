package com.recursive;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TextTest {

    @Test
    void rev() {
        var text = new Text();
        String result =text.rev("ali");
        Assertions.assertThat(result).isEqualTo("ila");
    }

}