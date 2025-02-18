package edu.uamm.tp;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ProduitsTest {

    // Exo 15 :
    
    @Test
    public void testRechercherUnProduitPresent(){

        Produits[] produits = {
            new Produits("Banane"),
            new Produits("Pomme"),
            new Produits("Datte")
        };
        
        List<String> products = new ArrayList<>();
        for (Produits produit : produits){
            products.add(produit.getProduit());
        }

        assertTrue(products.contains("Banane"));
        assertFalse(products.contains("Orange"));
        assertFalse(products.contains(""));

    }
}
