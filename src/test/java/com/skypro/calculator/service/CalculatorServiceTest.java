package com.skypro.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();
    @Test
    void plusPositive() {
        double actual = calculatorService.plus(3, 5);
        assertEquals(8, actual);
    }
    @Test
    void plusNegative() {
        double actual = calculatorService.plus(-3, -5);
        assertEquals(-8, actual);
    }
}
