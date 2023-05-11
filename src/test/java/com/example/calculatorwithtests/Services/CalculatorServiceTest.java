package com.example.calculatorwithtests.Services;

import com.example.calculatorwithtests.Exceptions.MyIllegalArgumentException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculatorServiceTest {

    private CalculatorService calculatorService;
    private int num1;
    private int num2;
    private int num3;
    private int a;
    private int b;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
        num1 = 5;
        num2 = 6;
        num3 = 0;
        a = 34;
        b = 76;

    }

    @Test
    public void shouldReturnCorrectAddition(){
        String expected = num1 + " + " + num2 + " = " + (num1 + num2);
        String actual = calculatorService.addition(num1, num2);

        assertEquals(expected, actual);

        expected = a + " + " + b + " = " + (a + b);
        actual = calculatorService.addition(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectSubtraction(){
        String expected = num1 + " - " + num2 + " = " + (num1 - num2);
        String actual = calculatorService.subtraction(num1, num2);

        assertEquals(expected, actual);

        expected = a + " - " + b + " = " + (a - b);
        actual = calculatorService.subtraction(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectMultiply(){
        String expected = num1 + " * " + num2 + " = " + (num1 * num2);
        String actual = calculatorService.multiply(num1, num2);

        assertEquals(expected, actual);

        expected = a + " * " + b + " = " + (a * b);
        actual = calculatorService.multiply(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectDivision(){
        String expected = String.format("%d / %d = %.2f", num1, num2, (double)num1/num2);
        String actual = calculatorService.division(num1, num2);

        assertEquals(expected, actual);

        expected = String.format("%d / %d = %.2f", a, b, (double)a/b);
        actual = calculatorService.division(a, b);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDivisionByZero() {
        assertThrows(MyIllegalArgumentException.class,() -> calculatorService.division(num1, num3));
    }

}
