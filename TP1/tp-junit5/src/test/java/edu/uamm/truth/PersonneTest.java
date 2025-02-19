package edu.uamm.truth;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class PersonneTest {

    // Exo 3 :
    @Test
    public void testGetName(){

        Personne alice = new Personne("Alice", 30);

        assertThat(alice.getNom()).isEqualTo("Alice");
        assertThat(alice.getAge()).isGreaterThan(20);

    }

}
