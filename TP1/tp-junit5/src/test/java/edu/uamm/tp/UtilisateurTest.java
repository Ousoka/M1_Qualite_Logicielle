package edu.uamm.tp;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UtilisateurTest {

    //==============================================================================================

    // Exo 11 :
    @Test
    @DisplayName("Test avec des emails valides")
    void testEmailsValides() {
        assertAll(
            () -> assertTrue(Utilisateur.estEmailValide("exemple@test.com"), "Email valide"),
            () -> assertTrue(Utilisateur.estEmailValide("user.name@domain.co"), "Email valide"),
            () -> assertTrue(Utilisateur.estEmailValide("utilisateur123@test.org"), "Email valide"),
            () -> assertTrue(Utilisateur.estEmailValide("contact+info@company.net"), "Email valide")
        );
    }

    @Test
    @DisplayName("Test avec des emails invalides")
    void testEmailsInvalides() {
        assertAll(
            () -> assertFalse(Utilisateur.estEmailValide("exempletest.com"), "Email sans @"),
            () -> assertFalse(Utilisateur.estEmailValide("user@domain"), "Domaine sans extension"),
            () -> assertFalse(Utilisateur.estEmailValide("@test.com"), "Manque le nom"),
            () -> assertFalse(Utilisateur.estEmailValide("user@.com"), "Nom de domaine incorrect"),
            () -> assertFalse(Utilisateur.estEmailValide("user@domain..com"), "Double point dans le domaine"),
            () -> assertFalse(Utilisateur.estEmailValide(null), "Email null"),
            // () -> assertFalse(Utilisateur.estEmailValide("user@domainuamcom"),  "Email bizare"),
            () -> assertFalse(Utilisateur.estEmailValide(""), "Email vide"),
            () -> assertFalse(Utilisateur.estEmailValide("user@domain.c"), "Extension trop courte")
        );
    }

    //==============================================================================================

    // Exo 12 :

    @Test
    @DisplayName("Vérification que la liste n'est pas null")
    void testListeNonNulle() {
        List<String> noms = Utilisateur.obtenirNomsUtilisateurs();
        assertNotNull(noms, "La liste ne doit pas être null");
    }

    @Test
    @DisplayName("Vérification que la liste contient 'Alice'")
    void testContientAlice() {
        List<String> noms = Utilisateur.obtenirNomsUtilisateurs();
        assertTrue(noms.contains("Alice"), "La liste doit contenir 'Alice'");
    }

    //==============================================================================================

    // Exo 14 :
    @Test
    @DisplayName("Vérification que l'utilisateur est actif par défaut")
    void testUtilisateurActif() {
        // Création d'un utilisateur
        Utilisateur utilisateur = new Utilisateur();
        
        // Vérification que l'utilisateur est actif
        assertTrue(utilisateur.estActif(), "L'utilisateur nouvellement créé doit être actif");
    }

    //==============================================================================================

    // Exo 16 :

    @Test
    @DisplayName("Test pour vérifier que l'exception est levée si l'ID est null")
    void testSupprimerUtilisateurIdNull() {
        Utilisateur utilisateur = new Utilisateur();

        // Vérification que l'exception est levée lorsque l'ID est null
        assertThrows(IllegalArgumentException.class, () -> {
            utilisateur.supprimerUtilisateur(null);
        }, "L'ID ne peut pas être null ou vide.");
    }

    @Test
    @DisplayName("Test pour vérifier que l'exception est levée si l'ID est vide")
    void testSupprimerUtilisateurIdVide() {
        Utilisateur utilisateur = new Utilisateur();

        // Vérification que l'exception est levée lorsque l'ID est vide
        assertThrows(IllegalArgumentException.class, () -> {
            utilisateur.supprimerUtilisateur("");
        }, "L'ID ne peut pas être null ou vide.");
    } 

    //==============================================================================================

    // Exo 18 :

    @Test
    @DisplayName("Test pour vérifier que l'identifiant généré n'est jamais null et fait 10 caractères")
    void testGenererID() {
        Utilisateur utilisateur = new Utilisateur();
        // Générer un identifiant
        String identifiant = utilisateur.generer();

        // Vérifier que l'identifiant n'est pas null
        assertNotNull(identifiant, "L'identifiant généré ne doit pas être null.");

        // Vérifier que l'identifiant a bien 10 caractères
        assertEquals(10, identifiant.length(), "L'identifiant généré doit avoir 10 caractères.");
    }






        // Exo 14 :
        @Test
        @DisplayName("Vérification user est actif")
        void testUtilisateurActif1() {

            Utilisateur utilisateur = new Utilisateur();

            utilisateur.setActif(true);
        
            assertTrue(utilisateur.estActif(), "User est actif");
        }
}

