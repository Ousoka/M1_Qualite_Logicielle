package edu.uamm.tp;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class Utilisateur {


    // Exo 14 :

    private boolean actif;

    // Constructeur
    public Utilisateur() {
        // Par défaut, un utilisateur est actif
        this.actif = true;
    }

    // Méthode pour vérifier si l'utilisateur est actif
    public boolean estActif() {
        return actif;
    }

    //==============================================================================================
    
    // Exo 11 : 

    // Expression régulière pour valider un email
    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

    // validation d'email
    public static boolean estEmailValide(String email) {
        if (email == null) {
            return false;
        }
        return PATTERN.matcher(email).matches();
    }

    //==============================================================================================

    // Exo 12 :

    // Méthode qui retourne une liste de noms d'utilisateurs
    public static List<String> obtenirNomsUtilisateurs() {
        return Arrays.asList("Alice", "Bob", "Charlie", "David");
    }

    //==============================================================================================

    // Exo 16 :

    // Méthode pour supprimer un utilisateur par ID
    public void supprimerUtilisateur(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("L'ID ne peut pas être null ou vide.");
        }
        // Logique de suppression (par exemple, suppression dans une base de données)
        System.out.println("Utilisateur avec ID " + id + " supprimé.");
    }

    //==============================================================================================
    
    // Exo 18 :

    // Méthode pour générer un identifiant aléatoire de 10 caractères
    public static String generer() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder identifiant = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(caracteres.length());
            identifiant.append(caracteres.charAt(index));
        }

        return identifiant.toString();
    }
}
