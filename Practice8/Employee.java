public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee() {
        firstName = "";
        lastName = "";
        salary = 0;
    }

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary > 0 ? salary : 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary > 0 ? salary : 0;
    }

    public void giveRaise(int percent) {
        this.salary *= 1 + percent / 100.0;
    }
}

class EmployeeTester {
    public static void main(String[] args) {
        Employee a = new Employee(
            "Jane",
            "Doe",
            1000.00
        );
        Employee b = new Employee(
            "Bob",
            "Ross",
            500.00
        );

        System.out.printf("%s %s's salary: $%.2f%n", a.getFirstName(), a.getLastName(), a.getSalary());
        System.out.printf("%s %s's salary: $%.2f%n%n", b.getFirstName(), b.getLastName(), b.getSalary());

        a.giveRaise(10);
        b.giveRaise(10);

        System.out.printf("%s %s's new salary: $%.2f%n", a.getFirstName(), a.getLastName(), a.getSalary());
        System.out.printf("%s %s's new salary: $%.2f%n", b.getFirstName(), b.getLastName(), b.getSalary());
    }
}