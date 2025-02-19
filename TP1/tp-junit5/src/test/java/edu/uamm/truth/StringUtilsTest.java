package edu.uamm.truth;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class StringUtilsTest {

    // Exo 1 :
    @Test
    public void testBase(){
        String mot_a_tester = "java"; 
        assertThat(StringUtils.toUpperCase(mot_a_tester)).isEqualTo("JAVA");
    }

    @Test
    public void testContenant(){
        String mot_a_tester = "Test"; 
        // assertThat(StringUtils.toUpperCase(mot_a_tester)).contains("ES");
        assertThat(mot_a_tester).contains("es");

    }

    @Test
    public void testCommencantParEtTerminantPar(){
        String mot_a_tester = "Hello"; 
        // assertThat(StringUtils.toUpperCase(mot_a_tester)).startsWith("HE");
        assertThat(mot_a_tester).startsWith("He");
        // assertThat(StringUtils.toUpperCase(mot_a_tester)).endsWith("O");
        assertThat(mot_a_tester).endsWith("o");

    }



    @Test
    void testStringStartAndEnd() {
        assertThat("Hello").startsWith("He");
        assertThat("Hello").endsWith("o");
    }
}

