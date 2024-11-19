package SampleTest3;

public class YourName {
    public static int[] create(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 2 * i + 1;
        }
        return arr;
    }

    public static int sumSome(int[] arr, int howMany) {
        int sum = 0;

        for (int i = 0; i < Math.min(howMany, arr.length); i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] grow(int[] arr, int extra) {
        int[] newArr = new int[arr.length + extra];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        for (int i = arr.length; i < arr.length + extra; i++) {
            newArr[i] = 1;
        }
        return newArr;
    }

    public static void printArr(int[] arr) {
        System.out.print(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
        System.out.println();
    }
}

class Tester {
    public static void main(String[] args) {
        int[] arr = YourName.create(5);
        YourName.printArr(arr);

        int n = 4;
        System.out.printf("%nSum of the first %d values is %d%n%n", n, YourName.sumSome(arr, n));

        System.out.println("The enlarged list is:");
        YourName.printArr(
            YourName.grow(arr, 3)
        );
    }
}
