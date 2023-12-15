package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import static org.assertj.core.api.Assertions.withPrecision;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double output = SqArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}