package com.example.circle_area_demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleAreaTest {

    @Test
    void testAreaRadius5() {
        assertEquals(79, CircleArea.calculateArea(5), 0.0001);
    }

    @Test
    void testAreaRadiusZero() {
        assertEquals(0.0, CircleArea.calculateArea(0), 0.0001);
    }

    @Test
    void testNegativeRadius() {
        assertThrows(IllegalArgumentException.class,
                () -> CircleArea.calculateArea(-1));
    }
}