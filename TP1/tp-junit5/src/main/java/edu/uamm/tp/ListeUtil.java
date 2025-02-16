package edu.uamm.tp;

import java.util.Collections;
import java.util.List;

public class ListeUtil {

    // Méthode pour ajouter un élément à une liste
    public static void ajouterElement(List<String> list, String element) {
        list.add(element);
    }

    private List<String> produits;

    // Constructeur pour initialiser la liste de produits
    public ListeUtil(List<String> produits) {
        this.produits = produits;
    }

    // Méthode pour rechercher un produit dans la liste
    public boolean rechercherProduit(String nomProduit) {
        if (nomProduit == null || nomProduit.isEmpty()) {
            return false;  // Retourne false si la chaîne est vide ou null
        }
        return produits.contains(nomProduit);
    }

    // Méthode pour trier la liste par ordre alphabétique
    public static void trierListe(List<String> noms) {
        Collections.sort(noms);
    }
    
}
