package edu.uamm.tp;

public class Personne {
    private String nom;
    private int age;

    // Constructeur
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Méthode toString()
    @Override
    public String toString() {
        return "Nom: " + nom + ", Age: " + age;
    }
}

