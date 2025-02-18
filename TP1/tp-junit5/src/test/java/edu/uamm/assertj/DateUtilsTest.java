package edu.uamm.assertj;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class DateUtilsTest {
    
    @Test
    public void testBase(){
        System.out.println(LocalDate.now());
        // assertThat(DateUtils.getToday()).isEqualTo("2025-02-18"); 
        assertThat(DateUtils.getToday()).isEqualTo(LocalDate.now()); 
    }

    @Test
    public void testDateEntre2(){
        assertThat(DateUtils.getToday())
        // .isAfter("2000-01-01")
        .isAfter(LocalDate.of(2000, 01, 01))
        // .isBefore("2100-01-01"); 
        .isBefore(LocalDate.of(2100, 01, 01));

    }
}
