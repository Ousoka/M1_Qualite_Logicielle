package edu.uamm.tp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConfigurationTest {

    @Test
    @DisplayName("Test pour vérifier que Configuration.getInstance() retourne toujours la même instance")
    void testSingleton() {
        // Récupérer la première instance
        Configuration instance1 = Configuration.getInstance();
        
        // Récupérer la deuxième instance
        Configuration instance2 = Configuration.getInstance();
        
        // Vérifier que les deux instances sont identiques (référence égale)
        assertSame(instance1, instance2, "Les deux appels à getInstance() doivent retourner la même instance.");
    }
}

