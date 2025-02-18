package edu.uamm.tp;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonneTest {

    // Exo 9 :
    @Test
    @DisplayName("Test de la méthode toString() pour une personne")
    void testToString() {
        // Création d'un objet Personne
        Personne personne = new Personne("Jean", 30);

        // Vérification de la sortie de toString()
        assertEquals("Nom: Jean, Age: 30", personne.toString(), "La méthode toString() doit retourner la bonne description");
    }

    @Test
    void testPersonAttributes() {
        Personne person = new Personne("Alice", 30);
        
        // Vérifie que name = "Alice" et age = 30
        assertThat(person.getNom()).isEqualTo("Alice");
        assertThat(person.getAge()).isEqualTo(30);
    }

    @Test
    void testPersonEquality() {
        Personne person1 = new Personne("Alice", 30);
        Personne person2 = new Personne("Alice", 30);
        
        // Utilise usingRecursiveComparison pour comparer deux objets Person identiques
        assertThat(person1).usingRecursiveComparison().isEqualTo(person2);
    }

    @Test
    public void testPersonne() {
        // Création de l'objet Personne
        Personne personne = new Personne("Alice", 25);

        // 1. Vérifier que getNom() retourne "Alice"
        assertThat(personne.getNom()).isEqualTo("Alice");

        // 2. Vérifier que getAge() est supérieur à 20
        assertThat(personne.getAge()).isGreaterThan(20);
    }
}
