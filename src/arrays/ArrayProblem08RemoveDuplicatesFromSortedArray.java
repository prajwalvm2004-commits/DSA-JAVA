package arrays;

import java.util.Arrays;

public class ArrayProblem08RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] arr) {

        int prev = 0;
        for(int first = 1;first<arr.length;first++) {
            if (arr[first] != arr[prev]) {
                prev++;
                arr[prev] = arr[first];

            }
        }  return prev+1 ;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        int k = removeDuplicates(arr);

        System.out.println("Unique count: " + k);
        System.out.println("Unique elements: "
                + Arrays.toString(Arrays.copyOf(arr, k)));
    }
}