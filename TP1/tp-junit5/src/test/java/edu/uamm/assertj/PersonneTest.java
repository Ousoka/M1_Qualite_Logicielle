package edu.uamm.assertj;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonneTest {

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

}
