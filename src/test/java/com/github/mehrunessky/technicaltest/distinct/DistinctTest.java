package com.github.mehrunessky.technicaltest.distinct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DistinctTest {

    @Test
    void shouldDistinctValue() {

        List<String> values = DistinctUtils.distinctAndSort("A", "C", "B", "A", "5");

        Assertions.assertEquals(
            List.of("5", "A", "B", "C"),
            values
        );
    }


}
