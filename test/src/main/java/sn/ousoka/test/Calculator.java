package sn.ousoka.test;


public class Calculator {
    
    // Addition
    public int add(int a, int b) {
        return a + b;
    }
    
    // Soustraction
    public int subtract(int a, int b) {
        return a - b;
    }
    
    // Multiplication 
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Division (si le second argument est différent de 0)
    public int divide(int a, int b) {
        if(a == 0){
            throw new ArithmeticException("Division by zero error");
        }
        return a / b;
    }
}
