
package arrays;

public class ArrayProblem15MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
           int sum=0;
           for(int j=i;j<nums.length;j++){
               sum=sum+nums[j];

               if(sum>maxSum){
                   maxSum=sum;
               }
           }

       }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}
