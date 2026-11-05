package arrays;

import java.util.Arrays;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        // your logic here
        int [] result = new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            int  product=1;
//            for(int j=0;j<nums.length;j++){
//
//                if(i!=j){
//                    product *= nums[j];
//
//                }
//            }
//            result[i]=product;
//        }
        int leftProduct=1;
        int rightProduct=1;
        for(int i=0;i<nums.length-1;i++){
            rightProduct *= nums[i+1];
        }







        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));  // [24, 12, 8, 6]
        System.out.println(Arrays.toString(productExceptSelf(new int[]{2, 3, 5})));     // [15, 10, 6]
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 0, 3, 4})));  // [0, 12, 0, 0]
        System.out.println(Arrays.toString(productExceptSelf(new int[]{0, 0, 2})));     // [0, 0, 0]
        System.out.println(Arrays.toString(productExceptSelf(new int[]{5, 2})));        // [2, 5]
    }
}
