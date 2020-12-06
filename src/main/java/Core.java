public class Core {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println("List of years and info if leap year:");
        for (int year = 1900; year <= 2100; year++) {
            System.out.println("Year " + year + ": " + leapYear.checkLeapYear(year) );
        }
    }
}
