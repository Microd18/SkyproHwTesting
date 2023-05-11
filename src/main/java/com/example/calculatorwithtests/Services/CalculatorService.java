package com.example.calculatorwithtests.Services;

import com.example.calculatorwithtests.Exceptions.MyIllegalArgumentException;
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
            throw new MyIllegalArgumentException("Деление на ноль");
        }
        return String.format("%d / %d = %.2f", a,b,(double) a/b);
        //return a + " / " + b + " = " + ((double)a / b);
    }
}
