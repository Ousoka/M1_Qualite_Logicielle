package edu.uamm.assertj;

import java.util.List;

public class ListeUtils {

    // Exo 2 : 

    public static List<String> filterNames(List<String> names) { 
        return names.stream().filter(name -> name.startsWith("A")).toList(); 
    } 
    //recup une liste de noms et et la filtre en gardant uniquement ceux commencant par A     
}
