public class Test {
    public static void main(String[] args) {

        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonths(1, 2020));
    }

    public static boolean isLeapYear(int year) {
        if((year > 1) && (year < 9999)) {
            if (year % 4 != 0) {
                return false;
            } else if (year % 100 != 0) {
                return true;
            } else if (year % 400 != 0) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonths(int month, int year) {

        int days = 0;

        if((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        if(isLeapYear(year) && month == 2) { 
            days = 29;
        } else {
            switch (month) {
                case 1:
                case 5:
                case 3:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 2:
                    days = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                default:
                    break;
            }
        }
        return days;
    }
}
