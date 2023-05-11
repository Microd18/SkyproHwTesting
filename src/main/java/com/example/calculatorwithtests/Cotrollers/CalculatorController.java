package com.example.calculatorwithtests.Cotrollers;

import com.example.calculatorwithtests.Services.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    public final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/add")
    public String addition(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.addition(num1, num2);
    }

    @GetMapping("/sub")
    public String subtraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.subtraction(num1, num2);
    }

    @GetMapping("/mul")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/div")
    public String division(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.division(num1, num2);
    }
}
