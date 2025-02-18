package edu.uamm.tp; 
 
// Exo 1 :
public class Calculator { 

    public int add1(int a, int b) { 
        return a + b; 
    } 

    // Exo 2 :
    public int add(int a, int b) {
        long result = (long) a + b; 
        if (result > Integer.MAX_VALUE) {
            throw new ArithmeticException("Dépassement de la capacité d'un entier");
        }

        if (result < Integer.MIN_VALUE) {
            throw new ArithmeticException("Dépassement de la capacité d'un entier");
        }
        return (int) result;
    }

    public int subtract(int a, int b) { 
        return a - b; 
    } 
    public int multiply(int a, int b) { 
        return a * b; 
    }
    public double divide(int a, int b) { 
        if (b == 0) { 
            throw new IllegalArgumentException("Division par zéro non permise"); 
        } 
        return (double) a / b; 
    } 

    // 1. modulo 
    public int modulo(int a, int b) {
        return a % b;
    }
    

    // 3. modulo avec b=0
    public int modulo2(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro non permise");
        }
        return a % b;
    }
} 