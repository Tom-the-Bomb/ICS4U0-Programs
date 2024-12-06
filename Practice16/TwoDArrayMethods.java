package Practice16;

public class TwoDArrayMethods {
    public static int[][] initGrid(int size) {
        int[][] grid = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = (int) (Math.random() * size) + 1;
            }
        }
        return grid;
    }

    public static int numEven(int[][] grid) {
        int count = 0;

        for (int[] row : grid) {
            for (int elem : row) {
                if (elem % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int rowProduct(int[][] grid, int row) {
        if (row > grid.length - 1 || row < 0) {
            return -1;
        }

        int prod = 1;
        for (int j = 0; j < grid[row].length; j++) {
            prod *= grid[row][j];
        }
        return prod;
    }

    public static int colProduct(int[][] grid, int col) {
        if (col > grid[0].length - 1 || col < 0) {
            return -1;
        }

        int prod = 1;
        for (int i = 0; i < grid.length; i++) {
            prod *= grid[i][col];
        }
        return prod;
    }

    public static void swapRow(int[][] grid, int rowIndexA, int rowIndexB) {
        int[] temp = grid[rowIndexA];
        grid[rowIndexA] = grid[rowIndexB];
        grid[rowIndexB] = temp;
    }

    public static void printArray(int[][] grid) {
        for (int[] row : grid) {
            for (int elem : row) {
                System.out.print(elem + "  ");
            }
            System.out.println();
        }
    }
}

class Tester {
    public static void main(String[] args) {
        int size = 3;
        System.out.println("Size");
        System.out.println(size);

        int[][] grid = TwoDArrayMethods.initGrid(size);

        System.out.println("\nInitial Grid");
        TwoDArrayMethods.printArray(grid);

        System.out.println("\nProduct of elements in row 2 (index 1)");
        System.out.println(TwoDArrayMethods.rowProduct(grid, 1));

        System.out.println("\nProduct of elements in column 2 (index 1)");
        System.out.println(TwoDArrayMethods.colProduct(grid, 1));

        System.out.println("\nAfter swapping row 0 to row 1");
        TwoDArrayMethods.swapRow(grid, 0, 1);
        TwoDArrayMethods.printArray(grid);
    }
}
