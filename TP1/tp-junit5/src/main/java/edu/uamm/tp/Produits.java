package edu.uamm.tp;

import java.util.ArrayList;
import java.util.List;

public class Produits{

    // Exo 15 :

    // nom du produit
    private String nom_produit;

    // constructeur
    public Produits(String nom_produit){
        this.nom_produit = nom_produit;
    }

    // setter
    public void setProduit(String nom_produit){
        this.nom_produit = nom_produit;
    }

    // getter
    public String getProduit(){
        return this.nom_produit;
    }

    public String addProducts(String a, String b){
        return a + b;
    }

    public boolean  rechercherProduits(String nomProduit, List<String> produits){
        if (nomProduit == null || produits.isEmpty()) {
            return false;
        } else {
            return produits.contains(nomProduit);
        }

    }

    
}