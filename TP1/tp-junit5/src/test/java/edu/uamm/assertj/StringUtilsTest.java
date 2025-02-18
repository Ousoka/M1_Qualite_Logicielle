package edu.uamm.assertj;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    // Ex0 1 : 

    @Test
    // java en JAVA 
    public void testDeBase(){
        String mot_a_tester = "java";
        assertThat(StringUtils.toUpperCase(mot_a_tester))
        .isNotNull().isEqualTo("JAVA"); 
    }

    @Test
    // test avec null
    public void testAvecNull(){
        String mot_a_tester = null;
        assertThat(StringUtils.toUpperCase(mot_a_tester)).isNull(); 
    }

    @Test
    // test avec un mot commencant avec J et de long 4
    public void testAvecJ4(){
        String mot_a_tester = "Jok4";
        assertThat(StringUtils.toUpperCase(mot_a_tester))
        .startsWith("J").hasSize(4); 
    }
    
}

