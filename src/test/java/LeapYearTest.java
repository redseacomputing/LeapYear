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
    @DisplayName("test return value from new method")
    void testReturnValueFromNewMethod() {
        assertEquals(true, leapYear.checkLeapYear(2000));
    }

    @Test
    @DisplayName("test year 1999 return false")
    void testYear1999ReturnFalse() {
        assertEquals(false,leapYear.checkLeapYear(1999) );
    }


    @Test
    @DisplayName("check if century year ends with 00 is a leap year or not")
    void checkIfCenturyYearEndsWith00IsALeapYearOrNot() {
        assertEquals(true ,leapYear.checkLeapYear(400) );
    }

    @Test
    @DisplayName("check the century years that are not leap years")
    void checkTheCenturyYearsThatAreNotLeapYears() {
        assertEquals(false,leapYear.checkLeapYear(100) );
    }

}