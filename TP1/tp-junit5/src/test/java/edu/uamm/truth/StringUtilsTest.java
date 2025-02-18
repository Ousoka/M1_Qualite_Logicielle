package edu.uamm.truth;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    @Test
    void testToUpperCase() {
        assertThat(StringUtils.toUpperCase("java")).isEqualTo("JAVA");
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

