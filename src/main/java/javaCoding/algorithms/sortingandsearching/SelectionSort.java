package javaCoding.algorithms.sortingandsearching;

import java.util.Arrays;

public class SelectionSort {

    private static int COUNT = 0;

    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
        selectionSort(arr);
        Arrays.stream(arr)
                .forEach(x -> System.out.print(x + " "));
    }

    /**
     *
     * @param arr
     */
    public static void selectionSort(int[] arr) {
        int minIdx;
        // Traverse through all elements of the array
        for (int i = 0; i < arr.length; i++){
            // Find the index of minimum element from sublist i:arr.length - 1
            minIdx = findMin(arr, i);
            // Now swap the element with the leftmost unsorted element
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    /**
     *
     * @param arr
     * @param start
     * @return Index of the minimum element in the array
     */
    public static int findMin(int[] arr, int start) {
        if (start < 0)
            return 0;

        // increment counter
        COUNT++;
        int minIdx = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[minIdx] > arr[i])
                minIdx = i;
        }
        return minIdx;
    }
}
