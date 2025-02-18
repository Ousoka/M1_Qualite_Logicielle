package edu.uamm.assertj;
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

public class ListeUtilsTest {

    @Test
    void testFilterNames() {
        List<String> filteredNames = ListeUtils.filterNames(List.of("Alice", "Bob", "Anna"));
        
        // Vérifie que "Alice" et "Anna" sont dans la liste
        assertThat(filteredNames).contains("Alice", "Anna");
        
        // Vérifie que "Bob" n'est pas dans la liste
        assertThat(filteredNames).doesNotContain("Bob");
        
        // Vérifie que la liste a exactement 2 éléments
        assertThat(filteredNames).hasSize(2);
    }
}

