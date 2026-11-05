package arrays;
import java.util.Arrays;
import java.util.HashMap;

public class ArrayProblem09TwoSum {
         //BRUTE FORCE
//    public static int[] twoSum(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++){
//           for(int j=i+1;j<nums.length;j++){
//               int sum =nums[i]+nums[j];
//               if(sum==target){
//                   return new int[]{i,j};
//               }
//           }
//       }return new int[]{};
//    }
//  }
          //OPTIMIZED
         public static int[] twoSum(int[] nums, int target) {
             HashMap<Integer, Integer> map = new HashMap<>();

             for (int i = 0; i < nums.length; i++) {

                 // 1. Calculate the needed number
                 int needed =target-nums[i];

                 // 2. Check whether the map contains that number
                 if(map.containsKey(needed)){
                     // 3. If found, return the stored index and current index
                     return new int[]{map.get(needed), i};
                 }
                 map.put(nums[i], i);
             }
             return new int[]{};
         }
    public static void main(String[] args) {
        int[] nums ={2,7,11,15};
        int target =9;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
}


