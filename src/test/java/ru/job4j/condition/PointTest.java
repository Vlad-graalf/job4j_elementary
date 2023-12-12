package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
class PointTest {

    @Test
    void when00to20thenDot() {
        double expected = 5.0990195135927845;
        int x1 = 2;
        int y1 = 4;
        int x2 = 7;
        int y2 = 5;
        double output = Point.distance4(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to20thenMinusDot() {
        double expected = 2.23606797749979;
        int x1 = -1;
        int y1 = 2;
        int x2 = -3;
        int y2 = 1;
        double output = Point.distance3(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to20then1() {
        double expected = 1;
        int x1 = 2;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        double output = Point.distance2(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}