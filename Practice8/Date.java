public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        year = 0;
        month = 0;
        day = 0;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String displayDate() {
        return String.format("%d/%d/%d", month, day, year);
    }
}

class DateTester {
    public static void main(String[] args) {
        Date date = new Date(2007, 10, 22);
        date.setYear(2024);
        date.setMonth(11);
        date.setDay(10);

        System.out.println(date.displayDate());
    }
}
