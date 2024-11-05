package Practice11;

public class Engineer {
    private String title;
    private double yearlySalary;
    private int yearEmployed;

    public Engineer() {
        title = null;
        yearlySalary = 0;
        yearEmployed = 0;
    }

    public Engineer(String title, double yearlySalary, int yearEmployed) {
        this.title = title;
        this.yearlySalary = yearlySalary;
        this.yearEmployed = yearEmployed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public int getYearEmployed() {
        return yearEmployed;
    }

    public void setYearEmployed(int yearEmployed) {
        this.yearEmployed = yearEmployed;
    }

    public String toString() {
        return String.format("Title: %s, Yearly Salary: $%.2f, Year Employed: %d", title, yearlySalary, yearEmployed);
    }
}

class EngineerObject {
    public static void main(String[] args) {
        Engineer[] arr = new Engineer[4];
        arr[0] = new Engineer("Electrical Engineer", 120000, 2018);
        arr[1] = new Engineer("Mining Engineer", 150000, 2020);
        arr[2] = new Engineer("Mechanical Engineer", 130000, 2010);
        arr[3] = new Engineer("Computer Engineer", 180000, 2009);

        for (Engineer e : arr) {
            System.out.println(e);
        }
    }
}