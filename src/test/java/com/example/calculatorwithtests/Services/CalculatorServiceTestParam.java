package com.example.calculatorwithtests.Services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculatorServiceTestParam {

    private final CalculatorService out = new CalculatorService();

    @ParameterizedTest
    @MethodSource("provideParamsForAdditionsTests")
    public void shouldReturnCorrectAddition(int a, int b, String c) {
        String result = out.addition(a, b);
        assertEquals(result, c);
    }

    public static Stream<Arguments> provideParamsForAdditionsTests() {
        return Stream.of(
                Arguments.of(5,6,"5 + 6 = 11"),
                Arguments.of(3,4,"3 + 4 = 7"),
                Arguments.of(1,2,"1 + 2 = 3")
        );

    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtractionTests")
    public void shouldReturnCorrectSubtraction(int a, int b, String c) {
        String result = out.subtraction(a, b);
        assertEquals(result, c);
    }

    public static Stream<Arguments> provideParamsForSubtractionTests() {
        return Stream.of(
                Arguments.of(5,6,"5 - 6 = -1"),
                Arguments.of(3,-4,"3 - -4 = 7"),
                Arguments.of(1,2,"1 - 2 = -1")
        );

    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void shouldReturnCorrectMultiply(int a, int b, String c) {
        String result = out.multiply(a, b);
        assertEquals(result, c);
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {
        return Stream.of(
                Arguments.of(5,6,"5 * 6 = 30"),
                Arguments.of(3,-4,"3 * -4 = -12"),
                Arguments.of(1,0,"1 * 0 = 0")
        );

    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivisionTests")
    public void shouldReturnCorrectDivision(int a, int b, String c) {
        String result = out.division(a, b);
        assertEquals(result, c);
    }

    public static Stream<Arguments> provideParamsForDivisionTests() {
        return Stream.of(
                Arguments.of(8,4,"8 / 4 = 2,00"),
                Arguments.of(0,4,"0 / 4 = 0,00"),
                Arguments.of(7,25,"7 / 25 = 0,28")
        );

    }

}