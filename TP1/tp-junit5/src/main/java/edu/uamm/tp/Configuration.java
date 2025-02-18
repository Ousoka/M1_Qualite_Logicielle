package edu.uamm.tp;

public class Configuration {

    // Exo 19 :
    
    // Instance unique de la classe
    private static Configuration instance;

    // Constructeur privé pour empêcher la création d'instances supplémentaires
    private Configuration() {
        // Initialisation de la configuration (par exemple, chargement des paramètres)
    }

    // Méthode pour récupérer l'instance unique de la classe
    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    } 
}
