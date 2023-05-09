package com.example.calculatorwithtests;

import com.example.calculatorwithtests.Services.CalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {

    private CalculatorService calculatorService;
    private int num1;
    private int num2;
    private int num3;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
        num1 = 5;
        num2 = 6;
        num3 = 0;
    }

    @Test
    public void shouldReturnCorrectAddition(){
        String expected = num1 + " + " + num2 + " = " + (num1 + num2);
        String actual = calculatorService.addition(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectSubtraction(){
        String expected = num1 + " - " + num2 + " = " + (num1 - num2);
        String actual = calculatorService.subtraction(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectMultiply(){
        String expected = num1 + " * " + num2 + " = " + (num1 * num2);
        String actual = calculatorService.multiply(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectDivision(){
        String expected = num1 + " / " + num2 + " = " + ((double)num1 / num2);
        String actual = calculatorService.division(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDivisionByZero() {
        assertThrows(IllegalArgumentException.class,() -> calculatorService.division(num1, num3));
    }

}
