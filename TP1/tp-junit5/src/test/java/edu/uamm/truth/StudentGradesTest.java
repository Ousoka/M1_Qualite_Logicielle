package edu.uamm.truth;

import java.util.Map;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

public class StudentGradesTest {
    
    // Exo 5 :
    @Test
    public void testBase(){

        Map<String, Integer> notes = StudentGrades.getGrades();
        
        assertThat(notes).containsEntry("Alice", 18);
        // recup la value du key Bob
        assertThat(notes.get("Bob")).isGreaterThan(10);
        assertThat(notes).hasSize(3);
    }
}
