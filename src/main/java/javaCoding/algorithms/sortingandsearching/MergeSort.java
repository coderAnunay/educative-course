package javaCoding.algorithms.sortingandsearching;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] input = new int[]{ 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        mergeSort(0, input.length - 1, input);
        System.out.println("After Merge Sort: " + Arrays.toString(input));
    }

    /**
     *
     * @param arr: to be merged out of start->mid and mid+1->end
     * @param start: The starting index of arr
     * @param mid: The midpoint of arr
     * @param end: The end index of arr
     * @return
     */
    private static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] left = new int[n1 + 1];
        int[] right = new int[n2 + 1];

        // Store sentinel values
        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;

        // Copy the elements into left and right array respectively
        for(int i = 0; i < left.length - 1; i++)
            left[i] = arr[start + i];

        for(int j = 0; j < right.length - 1; j++)
            right[j] = arr[mid + j + 1];

        int i = 0, j = 0;
        // Now perform the merge of left and right arrays by comparing the values
        for(int k = start; k <= end; k++) {
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
        }
    }

    private static void mergeSort(int start, int end, int[] input) {
        if (start < end){
            int mid = (start + end) / 2;
            mergeSort(start, mid, input);
            mergeSort(mid + 1, end, input);
            merge(input, start, mid, end);
        }
    }
}
