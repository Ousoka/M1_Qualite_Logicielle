package com.qa.uam.sid;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        Assert.assertEquals(9, som);
    }

    // @Test
    // public void additionValeurNegativeParTry()
    // {
    //     try{
    //         calculatrice.addition(-1, 4);
    //         fail("l'addition ne marche pas");
    //     }catch (ArithmeticException exception){
    //         assertEquals("numerande negative", exception.getMessage());
    //     }
    // }

    @Test
    public void retournerUneValeurFaussePourAddition(){
        int som = calculatrice.addition(4, 5);// 9
        boolean t = som == 9;
        Assert.assertTrue( t); // passe

    }

//     @Test
//     public void additionValeurNegativeParAssertThrows(){
// //        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculatrice.addition(-1, 5));
// //        assertEquals("numerande negative", exception.getMessage());

//         assertThrows("numerande negative", ArithmeticException.class, () -> calculatrice.addition(-1, 5));
//     }

    // @Test(expected = ArithmeticException.class)
    // public void additionValeurNegativeParAnnotation(){
    //     calculatrice.addition(-1, 5);
    // }

    @Test
    public void soustractionTest(){

    }

}
