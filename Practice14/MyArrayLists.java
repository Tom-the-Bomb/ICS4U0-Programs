package Practice14;

import java.util.ArrayList;

public class MyArrayLists {
    public static ArrayList<Integer> numbers(int m, int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            arr.add((int) (Math.random() * n) + 1);
        }
        return arr;
    }

    public static <T> boolean search(ArrayList<T> arr, T item) {
        for (T elem : arr) {
            if (elem.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends Comparable<T>> void sort(ArrayList<T> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j).compareTo(arr.get(j + 1)) > 0) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static <T> void swap(ArrayList<T> arr, int indexA, int indexB) {
        T temp = arr.get(indexA);
        arr.set(indexA, arr.get(indexB));
        arr.set(indexB, temp);
    }

    public static <T> void shuffle(ArrayList<T> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int j = (int) (Math.random() * (arr.size() - i)) + i;

            swap(arr, i, j);
        }
    }

    public static <T> void reverse(ArrayList<T> arr) {
        for (int i = 0; i < arr.size() / 2; i++) {
            swap(arr, i, arr.size() - i - 1);
        }
    }

    public static <T> void insert(ArrayList<T> arr, int index, T element) {
        arr.add(element);

        for (int i = arr.size() - 1; i > index; i--) {
            swap(arr, i, i - 1);
        }
    }

    public static <T> void takeOut(ArrayList<T> arr, int index) {
        arr.remove(index);
    }

    public static <T> void takeOut(ArrayList<T> arr, T element) {
        arr.remove(element);
    }

    public static <T> void replace(ArrayList<T> arr, int index, T element) {
        arr.set(index, element);
    }
}

class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> list = MyArrayLists.numbers(10, 20);
        System.out.println(list);

        System.out.println(MyArrayLists.search(list, 12));

        MyArrayLists.sort(list);
        System.out.println(list);

        MyArrayLists.swap(list, 2, 4);
        System.out.println(list);

        MyArrayLists.shuffle(list);
        System.out.println(list);

        MyArrayLists.reverse(list);
        System.out.println(list);

        MyArrayLists.insert(list, 5, 69);
        System.out.println(list);

        MyArrayLists.takeOut(list, 2);
        System.out.println(list);

        MyArrayLists.takeOut(list, Integer.valueOf(69));
        System.out.println(list);

        MyArrayLists.replace(list, 2, 420);
        System.out.println(list);
    }
}