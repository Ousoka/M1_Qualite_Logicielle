package edu.uamm.tp;

public class StringUtil {

    // Exo 13 :

    // Méthode pour concaténer deux chaînes
    public static String concatener(String a, String b) {
        return a + b;
    }

    //==============================================================================================

    // Exo 17 :

    // Méthode pour transformer le texte : mettre en majuscules et supprimer les espaces en début et fin
    public static String transformerTexte(String texte) {
        if (texte == null) {
            return null;  // Si le texte est null, on retourne null
        }
        return texte.trim().toUpperCase();  // Retirer les espaces en début et fin, puis mettre en majuscules
    }

    //==============================================================================================

    // Exo 1 : Tester des chaînes de caractères 
    public static String toUpperCase(String input) { 
        return (input == null) ? null : input.toUpperCase(); 
    } 
}

