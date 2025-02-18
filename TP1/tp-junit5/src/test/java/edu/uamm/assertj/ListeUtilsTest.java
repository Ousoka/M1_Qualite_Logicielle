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
    public void testContenance(){

        // contient Alice et Anna
        assertThat(ListeUtils.filterNames(List.of("Alice", "Bob", "Anna")))
        .contains("Alice","Anna"); 
        // ne contient pas Bob
        assertThat(ListeUtils.filterNames(List.of("Alice", "Bob", "Anna")))
        .doesNotContain("Bob");
        // contient exactement 2 element
        assertThat(ListeUtils.filterNames(List.of("Alice", "Bob", "Anna")))
        .hasSize(2);

    }

}

