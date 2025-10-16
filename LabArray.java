// ArrayPrograms.java
// Solutions for the given array problems

import java.util.*;

public class LabArray {

    // 1️⃣ Replace duplicates with 0
    public static void replaceDuplicates(int[] arr) {
        System.out.println("Before removing duplicates:");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != 0) {
                    arr[j] = 0;
                }
            }
        }

        System.out.println("After replacing duplicates with 0:");
        for (int n : arr) System.out.print(n + " ");
        System.out.println("\n");
    }

    // 2️⃣ Find maximum and minimum element
    public static void findMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
            if (n < min) min = n;
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        System.out.println();
    }

    // 3️⃣ Separate even and odd elements
    public static void separateEvenOdd(int[] arr) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int n : arr) {
            if (n % 2 == 0)
                even.add(n);
            else
                odd.add(n);
        }

        System.out.println("Even elements: " + even);
        System.out.println("Odd elements: " + odd);
        System.out.println();
    }

    // 4️⃣ Sort elements in ascending order
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Array after sorting in ascending order:");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {9, -5, 7, 9, -5, 5, 7};

        // Problem 1
        replaceDuplicates(arr1.clone()); // clone to keep original array

        // Problem 2
        int[] arr2 = {9, -5, 7, 9, -5, 5, 7};
        findMaxMin(arr2);

        // Problem 3
        int[] arr3 = {9, -5, 7, 9, -5, 5, 7};
        separateEvenOdd(arr3);

        // Problem 4
        int[] arr4 = {9, -5, 7, 9, -5, 5, 7};
        sortArray(arr4);
    }
}
