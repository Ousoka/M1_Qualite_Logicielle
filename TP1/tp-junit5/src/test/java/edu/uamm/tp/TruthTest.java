package edu.uamm.tp;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;
public class TruthTest {
    
    @Test 
    void testInstallation() { 
        String message = "Google Truth fonctionne!"; 
        assertThat(message).isNotNull(); 
        assertThat(message).isEqualTo("Google Truth fonctionne!"); 
    } 
}
 