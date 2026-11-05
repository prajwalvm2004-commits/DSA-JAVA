package sorting;
import java.util.Arrays;

public class ArraySortingProblem02DescendingOrder {
    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 1, 3};
        Arrays.sort(nums);
        int i=0;
        int j =nums.length-1;
        while(i<j){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(nums));

    }
}
