package arrays;

import java.util.Arrays;

public class ArrayProblem06RotateArrayByK {

    public static void rotateByK(int[] arr, int k) {
        int temp=arr[arr.length-1-k];
        for(int i=arr.length;i>=1;i--){
            arr[i]=arr[i-k];
        }
        arr[k]=temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        rotateByK(arr, 3);

        System.out.println(Arrays.toString(arr));
    }
}