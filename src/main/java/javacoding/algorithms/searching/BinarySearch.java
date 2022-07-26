package javacoding.algorithms.searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinarySearch {

    public static void main(String[] args) {
        int[] input = new int[]{ 10, 18, 29, 45, 77, 89, 101, 144 };
        boolean result = binarySearch(input, 18);
        System.out.println("Binary Search Result for 18: " + result);
        result = binarySearch(input, 55);
        System.out.println("Binary Search Result for 55: " + result);

        int[] sanityTestInput1 = new int[] {};
        result = binarySearch(sanityTestInput1, 55);
        System.out.println("Binary Search Result for 55: " + result);

        int[] sanityTestInput2 = new int[] { 35 };
        result = binarySearch(sanityTestInput2, 35);
        System.out.println("Binary Search Result for 35: " + result);
    }

    private static boolean binarySearch(int[] input, int s) {
        if (input.length <= 0) {
            return false;
        }

        if (input.length == 1 && input[0] == s) {
            return true;
        }

        int start = 0;
        int end = input.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (s > input[mid]) {
                start = mid + 1;
            } else if (s < input[mid]) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
