package ru.levelup.l3;

import org.springframework.stereotype.Component;

@Component
public class MathService {
    public int sumM(int a, int b) {
        return a + b;
    }

    public int multiplyM(int a, int b){
        return a * b;
    }

    public int devideM(int a, int b){
        return a / b;
    }

    public int minusM(int a, int b){
        return a - b;
    }
}
