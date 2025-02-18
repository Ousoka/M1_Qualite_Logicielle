package edu.uamm.truth;

import java.util.List;

public class ListeUtils {

    // Exercice 2 : Tester des collections 
    public static List<String> filterNames(List<String> names) { 
        return names.stream().filter(name -> name.startsWith("A")).toList(); 
    } 
    
}
