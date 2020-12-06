import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    LeapYear leapYear;

    @BeforeEach
    void setUp() {
        leapYear = new LeapYear();
    }

    @Test
    @DisplayName("test centuries")
    void testCenturies() {
        for (int year = 1699; year <= 3000; year++) {
            assertEquals(Year.isLeap(year), leapYear.checkLeapYear(year));
        }
    }

}