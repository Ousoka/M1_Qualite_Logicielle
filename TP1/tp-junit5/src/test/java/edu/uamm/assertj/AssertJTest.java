package edu.uamm.assertj;


import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test; 
 
public class AssertJTest { 
 
    @Test 
    void testInstallation() { 
        String message = "AssertJ fonctionne!"; 
        assertThat(message).isNotNull() 
                           .isNotEmpty() 
                           .isEqualTo("AssertJ fonctionne!"); 
    } 
}