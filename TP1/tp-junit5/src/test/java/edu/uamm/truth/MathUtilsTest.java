package edu.uamm.truth;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test
    public void testDivideByZero() {
        // Vérifier que divide(4, 0) lève une IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> MathUtils.divide(4, 0));
    }
}
