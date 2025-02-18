package edu.uamm.assertj;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    // Exercice 1 : Tester des chaînes de caractères
    @Test
    void testToUpperCase() {
        // Vérifie que toUpperCase("java") retourne "JAVA"
        assertThat(StringUtils.toUpperCase("java"))
                .isNotNull()
                .isEqualTo("JAVA");
    }

    @Test
    void testToUpperCaseWithNull() {
        // Vérifie que toUpperCase(null) retourne null
        assertThat(StringUtils.toUpperCase(null)).isNull();
    }

    @Test
    void testToUpperCaseProperties() {
        // Vérifie que la chaîne retournée commence par "J" et a une longueur de 4
        assertThat(StringUtils.toUpperCase("java"))
                .startsWith("J")
                .hasSize(4);
    }
    
}

