package com.skypro.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedCalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();
    static Stream<Arguments> dataForPlus() {
        return Stream.of(
                Arguments.of(3, 5, 8),
                Arguments.of(123, 123, 246),
                Arguments.of(-123, 123, 0),
                Arguments.of(-111, -111, -222)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForPlus")
    void plus(double n1, double n2, double expected) {
        assertEquals(expected, calculatorService.plus(n1, n2));
    }
    static Stream<Arguments> dataForMinus() {
        return Stream.of(
                Arguments.of(3, 5, -2),
                Arguments.of(123, 123, 0),
                Arguments.of(-123, 123, -246),
                Arguments.of(-111, -111, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForMinus")
    void minus(double n1, double n2, double expected) {
        assertEquals(expected, calculatorService.minus(n1, n2));
    }
    static Stream<Arguments> dataForMultiply() {
        return Stream.of(
                Arguments.of(3, 5, 15),
                Arguments.of(12, 12, 144),
                Arguments.of(-9, 9, -81),
                Arguments.of(-11, -11, 121)
        );
    }

    @ParameterizedTest
    @MethodSource("dataForMultiply")
    void multiply(double n1, double n2, double expected) {
        assertEquals(expected, calculatorService.multiply(n1, n2));
    }

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(3, 5),
                Arguments.of(201,100),
                Arguments.of(-111,11),
                Arguments.of(-111,-11));
    }
    @ParameterizedTest
    @MethodSource("data")
    void divide(double n1, double n2) {
        double expected = n1 / n2;
        assertEquals(expected, calculatorService.divide(n1, n2));
    }
}
