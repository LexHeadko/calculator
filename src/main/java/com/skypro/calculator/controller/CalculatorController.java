package com.skypro.calculator.controller;

import com.skypro.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в Калькулятор!";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        double result = calculatorService.plus(num1, num2);
        return num1 + "+" + num2 + "=" + result;
    }
    @GetMapping("/minus")
    public String minus(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        double result = calculatorService.minus(num1, num2);
        return num1 + "-" + num2 + "=" + result;
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        double result = calculatorService.multiply(num1, num2);
        return num1 + "*" + num2 + "=" + result;
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        double result = calculatorService.divide(num1, num2);
        return num1 + "/" + num2 + "=" + result;
    }
}
