package javaCoding.algorithms.sortingandsearching;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 6, 9, 3, 1, 4, 0, 7};
        bubbleSort(arr);
        Arrays.stream(arr)
                .forEach(x -> System.out.print(x + " "));
    }

    /**
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        // Traverse through all elements of the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Last i elements are already in place
            for (int j = 0; j < arr.length - i - 1; j++) {
                // traverse array from 0 to arr[i-1]
                // Swap if the element is greater than the next element (for ascending order)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
