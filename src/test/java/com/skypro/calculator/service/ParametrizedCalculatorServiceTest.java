package com.skypro.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

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
}
