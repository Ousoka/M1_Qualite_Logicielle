package edu.uamm.tp; 
 
import static org.junit.jupiter.api.Assertions.*; 
    
import org.junit.jupiter.api.Test; 
 
class CalculatorTest { 
 
    private final Calculator calculator = new Calculator(); 
 
    @Test 
    void testAddition() { 
        assertEquals(5, calculator.add(2, 3)); 
    } 
 
    @Test 
    void testSoustraction() { 
        assertEquals(2, calculator.subtract(5, 3)); 
    } 
 
    @Test 
    void testMultiplication() { 
        assertEquals(15, calculator.multiply(3, 5)); 
    } 
 
    @Test 
    void testDivision() { 
        assertEquals(2.0, calculator.divide(6, 3)); 
    } 
 
    @Test 
    void testDivisionParZero() { 
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0)); 
    } 
} 