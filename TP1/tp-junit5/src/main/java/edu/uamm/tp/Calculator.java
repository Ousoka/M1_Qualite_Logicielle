package edu.uamm.tp; 
 
public class Calculator { 
    public int add(int a, int b) { 
        return a + b; 
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

    // 1. Ajouter une méthode modulo(int a, int b) à Calculator. 
    public int modulo(int a, int b) {
        return a % b;
    }
    

    // 3. Gérer le cas où b == 0 avec la methode modulo et tester ce cas
    public int modulo2(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division par zéro non permise");
        }
        return a % b;
    }
} 