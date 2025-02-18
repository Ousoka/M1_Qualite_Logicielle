package edu.uamm.assertj;

public class Personne {
    private String nom;
    private int age;

    // constructeur
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // setter
    public void setNom(String nom){
        this.nom = nom;
    }
    public void getAge(int age){
        this.age = age;
    }

    // getter
    public String getNom() { return nom; } 
    public int getAge() { return age; }

}

