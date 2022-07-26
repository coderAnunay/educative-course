package javacoding.algorithms.sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int[] input = new int[]{ 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        quickSort(input,0, input.length - 1);
        System.out.println("After Quick Sort: " + Arrays.toString(input));
    }

    public static int choosePivot(int left, int right) {
        Random rand = new Random();
        // Pick 3 random numbers within the range of the array
        int i1 = left + (rand.nextInt(right - left + 1));
        int i2 = left + (rand.nextInt(right - left + 1));
        int i3 = left + (rand.nextInt(right - left + 1));

        // Return their median
        return Math.max(Math.min(i1, i2), Math.min(Math.max(i1, i2), i3));
    }

    public static int partition(int arr[], int left, int right) {
        int pivotInd = choosePivot(left, right); // index of pivot element

        swap(arr, right, pivotInd);
        int pivot = arr[right]; //pivot element
        int i = left - 1; // all the elements <= pivot got at index <=i

        for(int j = left; j <= right - 1; j++) {
            if(arr[j] <= pivot) {
                i++; // increment the index
                swap(arr, i , j);
            }
        }
        swap(arr, i+1, right); // putting pivot back in place (rightful position in final sorted array)
        return i+1;
    }

    public static void quickSort(int arr[], int left, int right) {
        if(left < right) {
            // pi is where the pivot is at
            int pi = partition(arr, left, right);

            // separately sort elements before & after partition
            quickSort(arr, left, pi-1);
            quickSort(arr, pi+1, right);
        }
    }

    private static void swap(int[] arr, int right, int pivotInd) {
        int temp = arr[right];
        arr[right] = arr[pivotInd];
        arr[pivotInd] = temp;
    }
}
