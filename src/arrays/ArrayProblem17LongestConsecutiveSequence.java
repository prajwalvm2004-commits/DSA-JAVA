package arrays;
import java.util.Arrays;

public class ArrayProblem17LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int maxCount=1;

        for(int i=0;i<nums.length;i++){
            int count=1;
            for(int j=i;j<nums.length-1;j++){
                if((nums[j+1]-nums[j])==1){
                    count++;
                }else if(nums[j + 1] - nums[j] == 0){

                }
                else{
                    count=1;
                }
                if(count>maxCount){
                    maxCount=count;
                }

            }

        }
        return maxCount;
    }

    public static void main(String[] args) {
        //
        int[] nums = {10, 5, 11, 6, 12};
        //int[] nums = {9};

        System.out.println(longestConsecutive(nums));
    }
}