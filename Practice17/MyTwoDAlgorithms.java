package Practice17;

import java.util.Arrays;

public class MyTwoDAlgorithms {
    public static int rowSum(int[][] mat, int row) {
        int total = 0;
        for (int elem : mat[row]) {
            total += elem;
        }
        return total;
    }

    public static int colSum(int[][] mat, int col) {
        int total = 0;
        for (int i = 0; i < mat.length; i++) {
            total += mat[i][col];
        }
        return total;
    }

    public static int[] rowSumArray(int[][] mat) {
        int[] rowSum = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int elem : mat[i]) {
                rowSum[i] += elem;
            }
        }
        return rowSum;
    }

    public static int[] colSumArray(int[][] mat) {
        int[] colSum = new int[mat[0].length];

        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                colSum[j] += mat[i][j];
            }
        }
        return colSum;
    }

    public static int diagonalSumRight(int[][] mat) {
        int total = 0;

        for (int i = 0; i < mat.length; i++) {
            total += mat[i][mat[i].length - i - 1];
        }
        return total;
    }

    public static int diagonalSumLeft(int[][] mat) {
        int total = 0;

        for (int i = 0; i < mat.length; i++) {
            total += mat[i][i];
        }
        return total;
    }

    public static boolean isMagic(int[][] mat) {
        int sum = rowSum(mat, 0);

        for (int i = 1; i < mat.length; i++) {
            if (rowSum(mat, i) != sum) {
                return false;
            }
        }

        for (int j = 1; j < mat[0].length; j++) {
            if (colSum(mat, j) != sum) {
                return false;
            }
        }

        return diagonalSumLeft(mat) == sum && diagonalSumRight(mat) == sum;
    }

    public static int rowMax(int[][] mat, int row) {
        int max = mat[row][0];

        for (int elem : mat[row]) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    public static int colMax(int[][] mat, int col) {
        int max = mat[0][col];

        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > max) {
                max = mat[i][col];
            }
        }
        return max;
    }

    public static boolean isUpper(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j < i && mat[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void print(int[][] mat) {
        for (int[] row : mat) {
            for (int elem : row) {
                System.out.print(elem + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

class MyTwoDAlgorithmsTester {
    public static void main(String[] args) {
        int[][] values = new int[4][5];

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = j + 1;
            }
        }
        MyTwoDAlgorithms.print(values);

        values = new int[4][5];

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = j + i;
            }
        }
        MyTwoDAlgorithms.print(values);

        values = new int[5][5];

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = i == j ? i + 1 : 0;
            }
        }
        MyTwoDAlgorithms.print(values);

        // testing methods

        int[][] mat = {
            {1, 5, 8},
            {0, 6, 10},
            {0, 0, 4}
        };

        System.out.println(MyTwoDAlgorithms.rowSum(mat, 0));
        System.out.println(MyTwoDAlgorithms.colSum(mat, 2));

        System.out.println(Arrays.toString(MyTwoDAlgorithms.rowSumArray(mat)));
        System.out.println(Arrays.toString(MyTwoDAlgorithms.colSumArray(mat)));

        System.out.println(MyTwoDAlgorithms.diagonalSumLeft(mat));
        System.out.println(MyTwoDAlgorithms.diagonalSumRight(mat));

        System.out.println(MyTwoDAlgorithms.isMagic(mat));

        int[][] magicMat = {
            {2, 2, 2},
            {2, 2, 2},
            {2, 2, 2},
        };
        System.out.println(MyTwoDAlgorithms.isMagic(magicMat));

        System.out.println(MyTwoDAlgorithms.rowMax(mat, 0));
        System.out.println(MyTwoDAlgorithms.colMax(mat, 2));

        System.out.println(MyTwoDAlgorithms.isUpper(mat));
        System.out.println(MyTwoDAlgorithms.isUpper(magicMat));

        MyTwoDAlgorithms.print(mat);
    }
}