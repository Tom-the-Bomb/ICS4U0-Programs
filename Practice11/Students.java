package Practice11;

import java.util.Arrays;

public class Students {
    private String[] names;
    private double[] marks;

    public Students() {
        names = new String[0];
        marks = new double[0];
    }

    public Students(String[] names, double[] marks) {
        this.names = names;
        this.marks = marks;
    }

    public double average() {
        double avg = 0;
        for (double mark : marks) {
            avg += mark;
        }
        return avg / marks.length;
    }

    public String sort() {
        double[] copy = Arrays.copyOf(marks, marks.length);

        for (int i = 0; i < copy.length - 1; i++) {
            // first `i` elements will be sorted each iteration
            for (int j = i; j >= 0; j--) {
                // take i-th element and find a spot in the sorted submarksay we have
                // loop backwards through sorted submarksay until the `i-th` element is smaller than an element (place it before) [2]
                // place at start if not found [1]
                //
                // swap pairs of elements to slowly push the `i-th` element backwards in the submarksay to the start [1] or where it belongs [2]
                if (copy[j + 1] > copy[j]) {
                    break;
                }

                double temp = copy[j];
                copy[j] = copy[j + 1];
                copy[j + 1] = temp;
            }
        }

        String s = "";
        for (double mark : copy) {
            s += mark + " ";
        }
        return s;
    }

    public double median() {
        Arrays.sort(marks);

        int n = marks.length;

        return n % 2 == 0
            ? (marks[n / 2 - 1] + marks[n / 2]) / 2
            : marks[n / 2];
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < names.length; i++) {
            s += String.format("%s: %.1f%n", names[i], marks[i]);
        }
        return s;
    }
}

class StudentsTester {
    public static void main(String[] args) {
        Students students = new Students(
            new String[] {"John", "Max", "Ali", "Marry", "Mina", "Jack", "Jim", "Minoo"},
            new double[] {87, 76, 82, 92, 84, 68, 56, 94}
        );

        System.out.print(students);

        System.out.println("Sorted Marks");
        System.out.println(students.sort());

        System.out.println("Class average");
        System.out.printf("%.1f%n", students.average());

        System.out.println("Class median");
        System.out.printf("%.1f%n", students.median());
    }
}