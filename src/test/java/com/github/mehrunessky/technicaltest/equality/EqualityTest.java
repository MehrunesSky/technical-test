package com.github.mehrunessky.technicaltest.equality;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EqualityTest {

    @Test
    void shouldObjectMustBeEqual() {
        A a = new A("name1");
        A b = new A("name1");
        Assertions.assertEquals(
            a,
            b
        );
    }


}
