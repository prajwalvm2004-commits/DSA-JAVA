
package arrays;

public class ArrayProblem16ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){

            int product=1;
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    product = product *nums[j];
                }


            }  result[i] = product;

        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
