package edu.uamm.tp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    @DisplayName("Test de la concaténation de deux chaînes")
    void testConcatener() {
        // Cas normal
        assertEquals("HelloWorld", StringUtil.concatener("Hello", "World"), "La concaténation doit être correcte");

        // Cas avec une chaîne vide en premier
        assertEquals("World", StringUtil.concatener("", "World"), "La concaténation avec une chaîne vide en premier doit retourner la deuxième chaîne");

        // Cas avec une chaîne vide en second
        assertEquals("Hello", StringUtil.concatener("Hello", ""), "La concaténation avec une chaîne vide en second doit retourner la première chaîne");

        // Cas avec deux chaînes vides
        assertEquals("", StringUtil.concatener("", ""), "La concaténation de deux chaînes vides doit retourner une chaîne vide");
    }

    @Test
    @DisplayName("Test pour vérifier la transformation en majuscules et suppression des espaces")
    void testTransformerTexte() {
        // Cas normal avec texte contenant des espaces
        String texte = "   hello world   ";
        String resultat = StringUtil.transformerTexte(texte);
        assertEquals("HELLO WORLD", resultat, "Le texte doit être transformé en majuscules et les espaces supprimés.");
    }

    @Test
    @DisplayName("Test pour vérifier que les espaces sont supprimés aux deux extrémités")
    void testTransformerTexteAvecEspaces() {
        // Cas avec espace au début et à la fin
        String texte = "   test  ";
        String resultat = StringUtil.transformerTexte(texte);
        assertEquals("TEST", resultat, "Les espaces en début et fin doivent être supprimés et le texte doit être en majuscules.");
    }

    @Test
    @DisplayName("Test avec un texte déjà en majuscules")
    void testTransformerTexteMajuscules() {
        // Cas avec texte déjà en majuscules
        String texte = "HELLO WORLD";
        String resultat = StringUtil.transformerTexte(texte);
        assertEquals("HELLO WORLD", resultat, "Le texte en majuscules ne doit pas être modifié.");
    }

    @Test
    @DisplayName("Test avec un texte vide")
    void testTransformerTexteVide() {
        // Cas avec texte vide
        String texte = "   ";
        String resultat = StringUtil.transformerTexte(texte);
        assertEquals("", resultat, "Un texte vide avec des espaces doit être transformé en une chaîne vide.");
    }

    @Test
    @DisplayName("Test avec null comme entrée")
    void testTransformerTexteNull() {
        // Cas avec texte null
        String texte = null;
        String resultat = StringUtil.transformerTexte(texte);
        assertNull(resultat, "Le texte null doit retourner null.");
    }

    // Exercice 1 : Tester des chaînes de caractères
    @Test
    void testToUpperCase() {
        // Vérifie que toUpperCase("java") retourne "JAVA"
        assertThat(StringUtil.toUpperCase("java"))
                .isNotNull()
                .isEqualTo("JAVA");
    }

    @Test
    void testToUpperCaseWithNull() {
        // Vérifie que toUpperCase(null) retourne null
        assertThat(StringUtil.toUpperCase(null)).isNull();
    }

    @Test
    void testToUpperCaseProperties() {
        // Vérifie que la chaîne retournée commence par "J" et a une longueur de 4
        assertThat(StringUtil.toUpperCase("java"))
                .startsWith("J")
                .hasSize(4);
    }
    

    @Test
    void testToUpperCase1() {
        assertThat(StringUtil.toUpperCase("java")).isEqualTo("JAVA");
    }

    @Test
    void testContainsSubstring() {
        assertThat("Test").contains("es");
    }

    @Test
    void testStringStartAndEnd() {
        assertThat("Hello").startsWith("He");
        assertThat("Hello").endsWith("o");
    }
}

