package SampleTest1;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee tara = new Employee("Tara", 56.00, 160);

        System.out.printf("Name: %s%n", tara.getName());
        System.out.printf("Salary per hour: $%.2f%n", tara.getHourlySalary());
        System.out.printf("Number of hours: %d hours per month%n", tara.getNumberOfHours());

        System.out.printf("Month salary before increase: $%.2f%n", tara.monthlySalary());
        tara.increaseSalary(10);
        System.out.printf("Month salary after increase: $%.2f%n", tara.monthlySalary());
    }
}