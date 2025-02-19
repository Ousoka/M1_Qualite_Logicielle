package edu.uamm.truth;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class MathUtilsTest {
 
    // Exo 4 :

    // Il n'y pas de assertThrows avec Truth

    // exemple donnee dans le consigne
    // @Test 
    //     void testDivideByZero() { 
    //     assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(4, 0)); 
    // } 

    //
    @Test
    public void testVase(){
        //junit pour assertThrow et truth pour verifier cette assertion avec le message
        IllegalArgumentException exception = 
        assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(4, 0)); 
        // assertThat(exception.getMessage()).contains("Division par zéro !");
        assertThat(exception).hasMessageThat().contains("Division par zéro !");
    }

}
