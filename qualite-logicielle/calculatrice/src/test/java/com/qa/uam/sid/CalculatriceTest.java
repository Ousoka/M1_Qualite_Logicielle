package com.qa.uam.sid;

import org.junit.Assert;
import org.junit.Test;

public class CalculatriceTest {

    @Test
    public void additionTest(){
        Calculatrice calculatrice = new Calculatrice();
        int som = calculatrice.addition(4, 5);
        Assert.assertEquals(9, som);
    }

    @Test
    public void retournerUneValeurFaussePourAddition(){
        Calculatrice calculatrice = new Calculatrice();
        int som = calculatrice.addition(4, 5);// 9
        boolean t = som == 9;
        Assert.assertTrue( t); // passe

    }

    @Test
    public void soustractionTest(){

    }

}
