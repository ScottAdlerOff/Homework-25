package com.example.Homework25;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceIntf calculatorServiceIntf;

    public CalculatorController(CalculatorServiceIntf calculatorServiceIntf) {
        this.calculatorServiceIntf = calculatorServiceIntf;
    }

    @GetMapping
    public String greetings() {
        return calculatorServiceIntf.greetings();
    }

    @GetMapping(path = "/plus")
    public String plus (@RequestParam("num1") int a, @RequestParam("num2") int b){
        return a + " + " + b + " = " + calculatorServiceIntf.plus(a, b);
    }
    @GetMapping(path = "/minus")
    public String minus (@RequestParam("num1") int a, @RequestParam("num2") int b){
        return a + " - " + b + " = " + calculatorServiceIntf.minus(a, b);
    }
    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam("num1") int a, @RequestParam("num2") int b){
        return a + " * " + b + " = " + calculatorServiceIntf.multiply(a, b);
    }
    @GetMapping(path = "/divide")
    public String divide (@RequestParam("num1") float a, @RequestParam("num2") float b){
        return a + " / " + b + " = " + calculatorServiceIntf.divide(a, b);
    }
}