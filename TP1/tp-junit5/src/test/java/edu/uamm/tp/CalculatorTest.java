package edu.uamm.tp; 
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
 
public class CalculatorTest { 
 
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

    // 2. Ajouter des tests unitaires pour cette nouvelle méthode modulo
    @Test
    void testModulo() {
        assertEquals(2, calculator.modulo(5, 3));   // 5 mod 3 = 2
        assertEquals(1, calculator.modulo(7, 3));   // 7 mod 3 = 1
        assertEquals(1, calculator.modulo(10, 3));  // 10 mod 3 = 1
        assertEquals(-2, calculator.modulo(-5, 3));  // -5 mod 3 = -2
        assertEquals(-1, calculator.modulo(-7, 3));  // -7 mod 3 = -1
        assertEquals(-1, calculator.modulo(-10, 3)); // -10 mod 3 = -1
    }

    // 3. Gérer le cas où b == 0 avec la methode modulo et tester ce cas
    @Test
    void testModulo2() {
        assertThrows(IllegalArgumentException.class, () -> calculator.modulo2(5, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.modulo2(-5, 0));
        assertThrows(IllegalArgumentException.class, () -> calculator.modulo2(10, 0));        
    }
} 