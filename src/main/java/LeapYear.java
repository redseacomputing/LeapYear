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

}
