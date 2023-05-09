package com.example.calculatorwithtests.Services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String addition(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }

    public String subtraction(int a, int b) {
        return a + " - " + b + " = " + (a - b);
    }

    public String multiply(int a, int b) {
        return a + " * " + b + " = " + (a * b);
    }

    public String division(int a, int b) {
        if(b == 0){
            throw new IllegalArgumentException("Деление на ноль");
        }
        return a + " / " + b + " = " + ((double)a / b);
    }
}
