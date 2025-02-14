package sn.ousoka.test;

public class ScientificCalculator extends Calculator {
    
    // log
    public double log(int a) {
        // log(a)
        return Math.log(a);
    }

    public double logAdd(int a, int b) {
        // log(a + b)
        return log(add(a, b));
    }

    // sinus
    public double sinus(double a) {
        // sin(a)
        return Math.sin(a);
    }

    public double Addsinus(int a, int b) {
        // sin(a + b)
        return sinus(add(a, b));
    }
    
}
