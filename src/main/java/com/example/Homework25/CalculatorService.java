package com.example.Homework25;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceIntf {

    public String greetings() {return "<b>Добро пожаловать в калькулятор</b>";}

    public int plus (int a, int b){
        return a+b;
    }
    public int minus (int a, int b){
        return a-b;
    }
    public int multiply (int a, int b){
        return a*b;
    }
    public float divide (float a, float b){
        if (b == 0){
            throw new ZeroDividerException();
        }
        return a/b;
    }
}
