package sn.ousoka.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    
    // Tests pour la méthode addition
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);
        Assert.assertEquals(4, result);
    }

    // Tests pour la méthodde addition (retourner une valeur fasse)
    @Test(expected = IllegalArgumentException.class)
    public void testAddException() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);
        Assert.assertEquals(5, result);
    }

    // Tests pour la méthode addition (retourner une valeur fasse)
    @Test
    public void testAddFalse() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 2);
        boolean expected = result == 4;
        // boolean expectedFalse = result != 3;
        Assert.assertTrue(expected);
        // Assert.assertFalse(expectedFalse);
    }

    // Tests pour la méthode soustraction
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(2, 2);
        Assert.assertEquals(0, result);
    }
    
    // Tests pour la méthode soustraction (retourner une valeur fasse)
    @Test
    public void testSubtractFalse() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(2, 2);
        boolean expected = result == 0;
        Assert.assertTrue(expected);
    }
    
    // Tests pour la méthode multiplication
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 2);
        Assert.assertEquals(4, result);
    }

    // Tests pour la méthode division with zero division error
    // @Test(expected = ArithmeticException.class)
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(4, 0);
        // int result = calculator.divide(4, 0);
        // Assert.assertEquals(2, result);
    }


    
}
