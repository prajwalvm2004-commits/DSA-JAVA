package sorting;

import java.util.Arrays;

public class ArraySortingProblem04SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 1, 3};


        for(int i=0;i<nums.length-1; i++){
            int minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;

                }
            }int temp=nums[i];
            nums[i]=nums[minIndex];
            nums[minIndex]=temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}