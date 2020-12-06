import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    LeapYear leapYear;

    @BeforeEach
    void setUp() {
        leapYear = new LeapYear();
    }

    @Test
    @DisplayName("test if test environment work correct")
    void testIfTestEnvironmentWorkCorrect() {
        assertEquals(1,2 );
    }
}