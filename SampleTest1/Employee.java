package SampleTest1;

public class Employee {
    private String name;
    private double hourlySalary;
    private int numberOfHours;

    public Employee() {
        name = null;
        hourlySalary = 0;
        numberOfHours = 0;
    }

    public Employee(String name, double hourlySalary, int numberOfHours) {
        this.name = name;
        this.hourlySalary = hourlySalary;
        this.numberOfHours = numberOfHours;
    }

    public double monthlySalary() {
        return hourlySalary * numberOfHours;
    }

    public void increaseSalary(double percentage) {
        hourlySalary += percentage / 100.0 * hourlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double salary) {
        this.hourlySalary = salary;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int hours) {
        this.numberOfHours = hours;
    }
}