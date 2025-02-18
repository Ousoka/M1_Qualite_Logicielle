package edu.uamm.assertj;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class DateUtilsTest {
    
    @Test
    void testGetToday() {
        assertThat(DateUtils.getToday()).isEqualTo(LocalDate.now());
    }

    @Test
    void testGetTodayWithinRange() {
        assertThat(DateUtils.getToday()).isAfter(LocalDate.of(2000, 1, 1))
                                         .isBefore(LocalDate.of(2100, 1, 1));
    }
}
