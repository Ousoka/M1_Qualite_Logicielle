package edu.uamm.assertj;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonneTest {

    @Test 
    // verif de base
    public void testBase(){
        Personne alice = new Personne("Alice", 30); 

        assertThat(alice.getNom()).isEqualTo("Alice"); 
        assertThat(alice.getAge()).isEqualTo(30); 
    }

    @Test 
    // comparer 2 personnes
    public void test2PersonnesIdentitques(){
        Personne alice = new Personne("Alice", 30); 
        Personne ousmaneka = new Personne("Alice", 30); 

        assertThat(alice).usingRecursiveComparison()
        .isEqualTo(ousmaneka);
    }

}
