package Practice17;

public class SeatingPlan {
    private String name;
    private int row;
    private int col;

    public SeatingPlan(String name, int row, int col) {
        this.name = name;
        this.row = row;
        this.col = col;
    }

    public String toString() {
        return String.format("%s(%d,%d)", name, row, col);
    }
}

class SeatingPlanTester {
    public static void main(String[] args) {
        String[][] names = {
            {"Maria", "Minoo", "Ali"},
            {"John", "Reza", "Mahin"},
            {"Maria", "Mina", "Tara"}
        };

        SeatingPlan[][] plan = new SeatingPlan[names.length][names[0].length];

        for (int i = 0; i < plan.length; i++) {
            for (int j = 0; j < plan[i].length; j++) {
                plan[i][j] = new SeatingPlan(names[i][j], i, j);
            }
        }

        System.out.println("Grade 12 Seating Plan");

        for (SeatingPlan[] row : plan) {
            for (SeatingPlan elem : row) {
                System.out.print(elem + "  ");
            }
            System.out.println("\n");
        }
    }
}
