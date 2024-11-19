package SampleTest3;

public class Teacher {
    private String name;
    private int employeeNum;
    private String course;

    public Teacher() {
        name = null;
        employeeNum = 0;
        course = null;
    }

    public Teacher(String name, int employeeNum, String course) {
        this.name = name;
        this.employeeNum = employeeNum;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public String getCourse() {
        return course;
    }

    public String toString() {
        return String.format("Name: %s, Employee Number: %d, Subject: %s", name, employeeNum, course);
    }
}

class TeacherTester {
    public static void main(String[] args) {
        Teacher[] staff = {
            new Teacher("John Smith", 285, "Math"),
            new Teacher("Tara James", 486, "Physics"),
            new Teacher("Maria Wilson", 386, "Art")
        };

        System.out.println("Teachers profiles");
        for (Teacher t : staff) {
            System.out.println(t);
        }
    }
}
