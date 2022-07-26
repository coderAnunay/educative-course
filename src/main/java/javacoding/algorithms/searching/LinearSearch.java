package javacoding.algorithms.searching;

public class LinearSearch {

    public static void main(String[] args) {
        int[] input = new int[]{ 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        boolean result = linearSearch(input, 5);
        System.out.println("Linear Search Result for 5: " + result);
        result = linearSearch(input, 55);
        System.out.println("Linear Search Result for 55: " + result);

        int[] sanityTestInput1 = new int[] {};
        result = linearSearch(sanityTestInput1, 55);
        System.out.println("Linear Search Result for 55: " + result);

        int[] sanityTestInput2 = new int[] { 55 };
        result = linearSearch(sanityTestInput2, 55);
        System.out.println("Linear Search Result for 55: " + result);
    }

    private static boolean linearSearch(int[] input, int elem) {
        if (input.length <= 0) {
            return false;
        }

        if (input.length == 1 && input[0] == elem) {
            return true;
        }

        for (int i = 0; i < input.length; i++) {
            if(input[i] == elem) {
                return true;
            }
        }
        return false;
    }
}
