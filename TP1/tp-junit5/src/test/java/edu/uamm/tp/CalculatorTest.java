package edu.uamm.tp; 
 
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest { 
 
    // private final Calculator calculator = new Calculator(); 
 
    Calculator calculator;  // attributs

    @BeforeEach
    public void instance(){
        calculator = new Calculator();
    }

    @AfterEach
    public void apres(){
        calculator = null;
        System.out.println("La calculatrice est demarrée");
    }

    @Test 
    void testAddition() { 
        assertEquals(3, calculator.add(1, 2)); 
        assertEquals(5, calculator.add(2, 3));
        assertEquals(1, calculator.add(-1, 2)); 
    } 

    @Test
    void testAdditionLimiteSuperieure() {
        assertThrows(ArithmeticException.class, () -> calculator.add(Integer.MAX_VALUE, 1));
    }

    @Test 
    void testAdditionLimites() {
        assertThrows(ArithmeticException.class, () -> calculator.add(Integer.MAX_VALUE, 1)); 
        assertThrows(ArithmeticException.class, () -> calculator.add(Integer.MIN_VALUE, -1)); 

        int result = calculator.add(Integer.MAX_VALUE - 1, 1);
        assertTrue(result > 0 && result <= Integer.MAX_VALUE, "Le résultat dépasse la limite d'un entier");
        assertTrue(result < 0 && result >= Integer.MIN_VALUE, "Le résultat depasse la limite d'un entier");
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

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5}) // Valeurs testées
    void testAddition(int valeur) {
        int resultat = calculator.add(valeur, valeur); // Additionner la valeur à elle-même
        assertEquals(valeur * 2, resultat, "L'addition doit être correcte");
    }

    @Test
    @DisplayName("Test de l'addition de deux nombres positifs")
    void testAdditionPositifs() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 doit être égal à 5");
    }
} 