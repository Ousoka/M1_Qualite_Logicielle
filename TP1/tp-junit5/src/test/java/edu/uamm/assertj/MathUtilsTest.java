package edu.uamm.assertj;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    @Test 
    public void testBase(){
        assertThat(MathUtils.divide(4, 2)).isEqualTo(2); 
    }

    @Test
    public void testAvecException(){
        assertThatThrownBy(()->MathUtils.divide(4, 0))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("Division par zéro !"); 
    }


}
