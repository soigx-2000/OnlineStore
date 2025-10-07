public class Date{// I always wanted to make a Date class{
    int month;
    int day;
    int year;
    public static void validateDate(int mm_dd_yyyy) {
        if (100000000 > mm_dd_yyyy || mm_dd_yyyy < -100000000) {// 8 digit
            throw new IllegalArgumentException("Date must be in MMDDYYYY format.");
        }
        int mm_dd = mm_dd_yyyy/10000; // remove last four digit
        if (mm_dd%100 > 31) {// Check day
            throw new IllegalArgumentException("No month on earth has more 31 days");
        }
        int mm = mm_dd/100;
        if (mm > 12) {// Check month
            throw new IllegalArgumentException("Nope, last time I checked, there are only 12 months in a year.");
        }

    }
    public Date(int mm_dd_yyyy){// as explained, input in the date in mm_dd_yyyy, this class will check if it is valid
        try {
            validateDate(mm_dd_yyyy); // This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            // AI tells me to use "err" instead of "out, claiming it's for errors"
        }
        this.month = mm_dd_yyyy / 1000000;
        this.day = (mm_dd_yyyy / 10000) % 100;
        this.year = mm_dd_yyyy % 10000;
    }
    public String toString(){
        return month + "/" + day + "/" + year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }
}
