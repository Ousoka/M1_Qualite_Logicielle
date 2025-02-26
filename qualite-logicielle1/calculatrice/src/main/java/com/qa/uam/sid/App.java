package com.qa.uam.sid;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculatrice calculateur = new Calculatrice();
        int som = calculateur.addition(4, 5);
        System.out.println(" le result de 4 + 5 est " + som);

    }
}
