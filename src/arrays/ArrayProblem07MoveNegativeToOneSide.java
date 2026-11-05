package arrays;

import java.util.Arrays;

public class ArrayProblem07MoveNegativeToOneSide {

    public static void moveNegatives(int[] arr) {
        int i=0;
        int j=arr.length-1;
//        while(i<j){
//            if(arr[i]>=0 && arr[j]<=0){
//                int temp = arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                i++;
//                j--;
//            }else if(arr[i]<0 && arr[j]<0){
//                i++;
//            }else {
//                j--;
//
//            }
//
//        }
        while(i<j){
            while(i<j && arr[i]<0){
                i++;
            }while(i<j && arr[j]>=0){
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6, 7};

        moveNegatives(arr);

        System.out.println(Arrays.toString(arr));
    }
}