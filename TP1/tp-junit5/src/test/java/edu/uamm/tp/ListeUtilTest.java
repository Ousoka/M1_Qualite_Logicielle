package edu.uamm.tp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ListeUtilTest {

    @Test
    @DisplayName("Test de l'ajout d'un élément à une liste")
    void testAjouterElement() {
        // Création d'une liste vide
        List<String> liste = new ArrayList<>();

        // Ajout d'un élément
        ListeUtil.ajouterElement(liste, "Bonjour");

        // Vérification de plusieurs conditions avec assertAll()
        assertAll(
            () -> assertEquals(1, liste.size(), "La taille de la liste doit être 1 après l'ajout"),
            () -> assertTrue(liste.contains("Bonjour"), "La liste doit contenir l'élément ajouté"),
            () -> assertEquals("Bonjour", liste.get(0), "Le premier élément doit être 'Bonjour'")
        );
    }

    @Test
    @DisplayName("Test lorsque le produit est présent dans la liste")
    void testProduitPresent() {
        ListeUtil gestionProduits = new ListeUtil(Arrays.asList("Pomme", "Banane", "Orange"));
        assertTrue(gestionProduits.rechercherProduit("Banane"), "Le produit 'Banane' doit être trouvé dans la liste");
    }

    @Test
    @DisplayName("Test lorsque le produit est absent de la liste")
    void testProduitAbsent() {
        ListeUtil gestionProduits = new ListeUtil(Arrays.asList("Pomme", "Banane", "Orange"));
        assertFalse(gestionProduits.rechercherProduit("Poire"), "Le produit 'Poire' ne doit pas être trouvé dans la liste");
    }

    @Test
    @DisplayName("Test lorsque la recherche est effectuée avec une chaîne vide")
    void testRechercheChaineVide() {
        ListeUtil gestionProduits = new ListeUtil(Arrays.asList("Pomme", "Banane", "Orange"));
        assertFalse(gestionProduits.rechercherProduit(""), "La recherche avec une chaîne vide doit retourner false");
    }

    @Test
    @DisplayName("Test du tri de la liste de noms")
    void testTrierListe() {
        // Cas 1 : La liste triée est correcte
        List<String> noms = Arrays.asList("Zoe", "Alice", "Bob");
        ListeUtil.trierListe(noms);
        assertEquals(Arrays.asList("Alice", "Bob", "Zoe"), noms, "La liste doit être triée par ordre alphabétique.");
    }

    @Test
    @DisplayName("Test d'une liste vide")
    void testListeVide() {
        // Cas 2 : Une liste vide ne pose pas de problème
        List<String> noms = Arrays.asList();
        ListeUtil.trierListe(noms);
        assertTrue(noms.isEmpty(), "La liste vide doit rester vide après le tri.");
    }

    @Test
    @DisplayName("Test d'une liste avec un seul élément")
    void testListeAvecUnSeulElement() {
        // Cas 3 : Une liste avec un seul élément reste inchangée
        List<String> noms = Arrays.asList("Alice");
        ListeUtil.trierListe(noms);
        assertEquals(Arrays.asList("Alice"), noms, "La liste avec un seul élément doit rester inchangée après le tri.");
    }

    @Test
    void testFilterNames() {
        List<String> filteredNames = ListeUtil.filterNames(List.of("Alice", "Bob", "Anna"));
        
        // Vérifie que "Alice" et "Anna" sont dans la liste
        assertThat(filteredNames).contains("Alice", "Anna");
        
        // Vérifie que "Bob" n'est pas dans la liste
        assertThat(filteredNames).doesNotContain("Bob");
        
        // Vérifie que la liste a exactement 2 éléments
        assertThat(filteredNames).hasSize(2);
    }

    @Test
    public void testFilterNames1() {
        // Données de test
        List<String> names = List.of("Alice", "Anna", "Bob", "Charlie");

        // Appel de la méthode
        List<String> result = ListeUtil.filterNames(names);

        // 1. Vérifier que la liste retournée contient "Alice" et "Anna"
        assertThat(result).containsExactly("Alice", "Anna");

        // 2. Vérifier qu'elle ne contient pas "Bob"
        assertThat(result).doesNotContain("Bob");

        // 3. Vérifier qu'elle a exactement 2 éléments
        assertThat(result).hasSize(2);
    }
}

