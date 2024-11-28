package Practice15;

import java.util.*;

public class ArrayListMethods {
    public static <T> void swap(ArrayList<T> arr, int indexA, int indexB) {
        T temp = arr.get(indexA);
        arr.set(indexA, arr.get(indexB));
        arr.set(indexB, temp);
    }

    public static <T> void removeWord(ArrayList<T> arr, T wordToRemove) {
        while (arr.contains(wordToRemove)) {
            arr.remove(wordToRemove);
        }
    }

    public static <T extends Comparable<T>> void bubbleSort(ArrayList<T> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static <T extends Comparable<T>> void selectionSort(ArrayList<T> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int minI = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j).compareTo(arr.get(minI)) < 0) {
                    minI = j;
                }
            }
            swap(arr, i, minI);
        }
    }

    public static <T> void duplicateMatching(ArrayList<T> arr, T toDuplicate) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(toDuplicate)) {
                arr.add(i, toDuplicate);
                i++;
            }
        }
    }

    public static <T> int search(ArrayList<T> arr, T  key) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(
            Arrays.asList(5, 7, 5, 7, 7, 9, 5, 7)
        );

        ArrayList<String> arr2 = new ArrayList<>(
            Arrays.asList("D", "C", "A", "B", "A", "A")
        );

        selectionSort(arr);
        bubbleSort(arr2);
        System.out.println(arr);
        System.out.println(arr2);

        removeWord(arr2, "A");
        System.out.println(arr2);

        duplicateMatching(arr, 7);
        System.out.println(arr);

        System.out.println(search(arr2, "C"));
    }
}