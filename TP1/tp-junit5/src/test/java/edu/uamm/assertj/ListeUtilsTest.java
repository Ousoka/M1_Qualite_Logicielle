package edu.uamm.assertj;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class ListeUtilsTest {


    @Test
    public void testContenance(){

        // contient Alice et Anna
        assertThat(ListeUtils.filterNames(List.of("Alice", "Bob", "Anna")))
        .contains("Alice","Anna"); 
        // ne contient pas Bob
        assertThat(ListeUtils.filterNames(List.of("Alice", "Bob", "Anna")))
        .doesNotContain("Bob");
        // contient exactement 2 element
        assertThat(ListeUtils.filterNames(List.of("Alice", "Bob", "Anna")))
        .hasSize(2);

    }

    @Test
    public void testContenance1(){

        Personne[] personnes = {
            new Personne("Alice", 30),
            new Personne("Anna", 25),
            new Personne("Ousmane", 20)
        };

        List<String> noms = new ArrayList<>();

        for (Personne personne : personnes){
            noms.add(personne.getNom());
        }

        assertThat(ListeUtils.filterNames(noms)).contains("Alice");
        assertThat(ListeUtils.filterNames(noms)).doesNotContain("Bob");
        assertThat(ListeUtils.filterNames(noms)).hasSize(2);

    }

}

