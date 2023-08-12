package com.skypro.calculator.service;

import com.skypro.calculator.exception.DivisionByZeroException;
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
    @Test
    void minusPositive() {
        double actual = calculatorService.minus(3, 5);
        assertEquals(-2, actual);
    }
    @Test
    void minusNegative() {
        double actual = calculatorService.minus(-3, -5);
        assertEquals(2, actual);
    }
    @Test
    void multiplyPositive() {
        double actual = calculatorService.multiply(3, 5);
        assertEquals(15, actual);
    }
    @Test
    void multiplyNegative() {
        double actual = calculatorService.multiply(-3, -5);
        assertEquals(15, actual);
    }
    @Test
    void dividePositive() {
        double actual = calculatorService.divide(15, 5);
        assertEquals(3, actual);
    }
    @Test
    void divideNegative() {
        double actual = calculatorService.divide(-15, -5);
        assertEquals(3, actual);
    }

    @Test
    void divisionByZero() {
        assertThrows(DivisionByZeroException.class, () -> calculatorService.divide(10, 0));
    }
}
