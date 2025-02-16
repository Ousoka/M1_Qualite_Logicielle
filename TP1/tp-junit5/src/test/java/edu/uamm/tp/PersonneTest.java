package edu.uamm.tp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonneTest {

    @Test
    @DisplayName("Test de la méthode toString() pour une personne")
    void testToString() {
        // Création d'un objet Personne
        Personne personne = new Personne("Jean", 30);

        // Vérification de la sortie de toString()
        assertEquals("Nom: Jean, Age: 30", personne.toString(), "La méthode toString() doit retourner la bonne description");
    }
}
