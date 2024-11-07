package Practice12;

public class MyArray {
    public int[] fill(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }
        return arr;
    }

    public void print(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public void print(String[] arr) {
        for (String e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public int[] searchPositions(int[] arr, int target) {
        int count = 0;

        for (int e : arr) {
            if (e == target) {
                count++;
            }
        }

        int[] targets = new int[count];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                targets[j] = i;
                j++;
            }
        }
        return targets;
    }

    public int[] addEnd(int[] arr, int e) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = e;
        return newArr;
    }

    public int[] addFront(int[] arr, int e) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = e;

        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    public int[] remove(int[] arr, int idx) {
        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (i < idx) {
                newArr[i] = arr[i];
            } else if (i > idx) {
                newArr[i - 1] = arr[i];
            }
        }
        return newArr;
    }

    public int[] insert(int[] arr, int idx, int e) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            if (i < idx) {
                newArr[i] = arr[i];
            } else if (i == idx) {
                newArr[i] = e;
            }

            if (i >= idx) {
                newArr[i + 1] = arr[i];
            }
        }
        return newArr;
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void sort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void twoSmallest(int[] arr) {
        int s1 = Integer.MAX_VALUE;
        int s2 = Integer.MAX_VALUE;

        for (int e : arr) {
            if (e < s1) {
                s2 = s1;
                s1 = e;
            } else if (e < s2) {
                s2 = e;
            }
        }
        System.out.printf("Smallest: %d%n2nd Smallest: %d%n", s1, s2);
    }

    public boolean palindrome(String s) {
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - i - 1];
        }
        return rev;
    }
}

class MyArrayTester {
    public static void main(String[] args) {
        MyArray m = new MyArray();

        int[] list = m.fill (20);

        m.print(list);

        list = m.addEnd(list, 98);
        m.print(list);

	    list = m.addFront(list, 99);
        m.print(list);

		list = m.remove(list, 3);
        m.print(list);

        m.print(m.searchPositions(list, 2));

        list = m.insert(list, 9,5);
        m.print(list);

        m.sort(list);
        m.print(list);

        m.twoSmallest(list);

        String[] names = {
            "Zia",
            "Bob",
            "Adam"
        };
        m.sort(names);
        m.print(names);

        System.out.println(m.palindrome("abacaba"));

        list = m.reverse(list);
        m.print(list);
    }
}