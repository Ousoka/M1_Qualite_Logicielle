package edu.uamm.tp;

import java.util.Collections;
import java.util.List;

public class ListeUtil {

    // Exo 10 : ajouter un élément à une liste
    public static void ajouterElement(List<String> list, String element) {
        list.add(element);
    }

    //==============================================================================================

    // Exo 15 :
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


    //==============================================================================================

    // Exo 20 :

    // Méthode pour trier la liste par ordre alphabétique
    public static void trierListe(List<String> noms) {
        Collections.sort(noms);
    }

    // Exo 2 : Tester des collections 
    public static List<String> filterNames(List<String> names) { 
        return names.stream().filter(name -> name.startsWith("A")).toList(); 
    } 
    
}
