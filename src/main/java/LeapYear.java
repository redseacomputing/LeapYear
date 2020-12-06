public class LeapYear {
    boolean checkLeapYear(int year) {
        if(isCenturyYear(year)) {
            if(year % 400 == 0) {
                return true;
            } else return false;
        }
        if(year % 4 == 0) {
            return true;
        } else return false;
    }

     private boolean isCenturyYear(int year) {
        if(year % 4 == 0 && year % 100 == 0) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println("List of years and info if leap year:");
        for (int year = 1900; year <= 2100; year++) {
            System.out.println("Year " + year + ": " + leapYear.checkLeapYear(year) );
        }
    }
}
