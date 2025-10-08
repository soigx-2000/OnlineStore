public class Date{// I always wanted to make a Date class{
    int month;
    int day;
    int year;
    public static void validateDate(String mm_dd_yyyy) {
        if (mm_dd_yyyy.length() < 10) {// 8 digit + 2 slashes
            throw new IllegalArgumentException("Date must be in MMDDYYYY format.");
        }
        if (Integer.valueOf(mm_dd_yyyy.substring(3, 5)) > 31) {// Check day
            throw new IllegalArgumentException("No month on earth has more than 31 days");
        }
        if (Integer.valueOf(mm_dd_yyyy.substring(0, 2)) > 31) {// Check month
            throw new IllegalArgumentException("Nope, last time I checked, there are only 12 months in a year.");
        }

    }
    public Date(String mm_dd_yyyy){// as explained, input in the date in mm_dd_yyyy, this class will check if it is valid
        try {
            validateDate(mm_dd_yyyy); // This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            // AI tells me to use "err" instead of "out, claiming it's for errors"
        }
        this.month = Integer.valueOf(mm_dd_yyyy.substring(0, 2));
        this.day = Integer.valueOf(mm_dd_yyyy.substring(3, 5));
        this.year = Integer.valueOf(mm_dd_yyyy.substring(6));
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
