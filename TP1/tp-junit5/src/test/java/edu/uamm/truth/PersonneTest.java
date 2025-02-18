package edu.uamm.truth;
import static com.google.common.truth.Truth.assertThat;
import org.junit.jupiter.api.Test;

public class PersonneTest {


    @Test
    public void testGetName(){

        Personne alice = new Personne("Alice", 30);

        assertThat(alice.getNom()).isEqualTo("Alice");
        assertThat(alice.getAge()).isGreaterThan(20);

    }

}
