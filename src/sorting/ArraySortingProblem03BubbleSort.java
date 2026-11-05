package sorting;
import java.util.Arrays;

public class ArraySortingProblem03BubbleSort {
    public static void main(String[] args) {
//        int[] nums = {5, 2, 8, 1, 3};
//        for(int i=0;i<nums.length-1;i++){
//            for(int j=0;j<nums.length-1;j++){
//                if(nums[j]>=nums[j+1]){
//                    int temp=nums[j+1];
//                    nums[j+1]=nums[j];
//                    nums[j]=temp;
//                }
//            }
//        }
        int[] nums = {1, 2, 3, 5, 8};
        boolean swapped;

        do {
            swapped = false;

            // Your nested loop goes here.
            for(int i=0;i<nums.length-1;i++){
                for(int j=0;j<nums.length-1-i;j++){
                    if(nums[j]>nums[j+1]){
                        int temp = nums[j + 1];
                        nums[j + 1] = nums[j];
                        nums[j] = temp;
                        swapped=true;
                    }

                }
            }


        } while (swapped);
           System.out.println(Arrays.toString(nums));
    }
}
