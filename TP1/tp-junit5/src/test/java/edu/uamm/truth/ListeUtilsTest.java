package edu.uamm.truth;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class ListeUtilsTest {

    // Exo 2 :
    @Test 
    public void testContenance(){

        Personne[] personnes = {
            new Personne("Alice", 30),
            new Personne("Anna", 25),
            new Personne("Ousmane", 20)
        };

        List<String> noms = new ArrayList<>();

        for (Personne personne : personnes){
            noms.add(personne.getNom());
        }

        List<String> noms_a_tester = ListeUtils.filterNames(noms);

        assertThat(noms_a_tester).contains("Alice");
        assertThat(noms_a_tester).doesNotContain("Bob");
        assertThat(noms_a_tester).hasSize(2);
    }
}

