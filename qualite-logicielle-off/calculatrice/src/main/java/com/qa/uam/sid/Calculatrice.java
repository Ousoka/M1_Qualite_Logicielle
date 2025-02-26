package com.qa.uam.sid;

public class Calculatrice {

    public int addition(int a, int b){
        if(a < 0){
            throw new ArithmeticException("numerande negative");
        }
        return a + b;
    }
}
