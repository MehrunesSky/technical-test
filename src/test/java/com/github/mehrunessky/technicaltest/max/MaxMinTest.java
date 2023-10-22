package com.github.mehrunessky.technicaltest.max;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxMinTest {

    @Test
    void shouldMaxValue() {
        int m = MaxUtils.getMax(1, 6, 9, 12, -2);

        Assertions.assertEquals(
            12,
            m
        );
    }

    @Test
    void shouldMinValue() {
        int m = MaxUtils.getMax(1, 6, 9, 12, -2);

        Assertions.assertEquals(
            -2,
            m
        );
    }


}
