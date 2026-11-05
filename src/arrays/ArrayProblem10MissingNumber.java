package arrays;
import java.util.Arrays;

public class ArrayProblem10MissingNumber {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum = (n*(n+1))/2;
        int actualSum=0;
        for(int i=0;i<nums.length;i++){
            actualSum += nums[i];
        }return expectedSum-actualSum;
    }

    public static void main(String[] args) {
        int[] nums ={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));

    }
}
