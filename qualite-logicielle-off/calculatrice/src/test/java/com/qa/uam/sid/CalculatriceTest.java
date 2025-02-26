package com.qa.uam.sid;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class CalculatriceTest {
    Calculatrice calculatrice;  // attributs

    @Before
    public void instance(){
        calculatrice = new Calculatrice();
    }

    @After
    public void apres(){
        calculatrice = null;
    }



    @Test
    public void additionTest(){
        int som = calculatrice.addition(4, 5);
        assertEquals(9, som);
    }

    @Test
    public void additionValeurNegativeParTry()
    {
        try{
            calculatrice.addition(-1, 4);
            fail("l'addition ne marche pas");
        }catch (ArithmeticException exception){
            assertEquals("numerande negative", exception.getMessage());
        }
    }

    @Test
    public void additionValeurNegativeParAssertThrows(){
//        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculatrice.addition(-1, 5));
//        assertEquals("numerande negative", exception.getMessage());

        assertThrows("numerande negative", ArithmeticException.class, () -> calculatrice.addition(-1, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void additionValeurNegativeParAnnotation(){
        calculatrice.addition(-1, 5);
    }


    // ecrire les methodes de tests de division et gerer la division par 0


    /*
        * Befor
        * additionTest
        * after
     */

    // Creer Deux classes extends Calculatrice
    /*
        * CalculatriceAvance : RacineCarre(Math.sqrt), Puissance(Math.pow)
        * CalculatriceScientifique : logarithme(Math.log), sinus(Math.sin)
     */

}
