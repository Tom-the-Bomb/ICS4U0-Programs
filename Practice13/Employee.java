package Practice13;

import java.util.*;

public class Employee {
    private String name;
    private int salary;
    private int year;
    private int month;
    private int day;

    public Employee() {
        name = null;
        salary = 0;
        year = 0;
        month = 0;
        day = 0;
    }

    public Employee(String name, int salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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

    public void raiseSalary(int percentage) {
        this.salary *= 1 + percentage / 100.0;
    }

    public String toString() {
        return String.format("Name: %s, Salary: %d, HireDay: %04d/%02d/%02d", name, salary, year, month, day);
    }
}

class EmployeeTester {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>(
            Arrays.asList(
                new Employee("John Smith", 70000, 1987, 12, 15),
                new Employee("Tara James", 60000, 1989, 10, 22),
                new Employee("Tony Baker", 50000, 1990, 11, 26)
            )
        );

        System.out.println("Salaries before increase");
        for (Employee e : employees) {
            System.out.println(e);
        }

        for (Employee e : employees) {
            e.raiseSalary(5);
        }

        System.out.println("\nSalaries after increase");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}