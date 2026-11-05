package arrays;

public class ArrayProblem03CheckSortedAndCount {
    public static boolean isSorted(int[] arr) {
       boolean isSorted =true;
       for(int i=0;i<arr.length-1;i++){
           if(arr[i]>arr[i+1]){
               isSorted= false;
               break;
           }
       }return isSorted;
    }

    public static int countDuplicates(int[] arr) {
        int count=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            }
        }return count;

   }

    public static void main(String[] args) {
        int[] arr = {10,20, 20, 30, 40, 50,50};
        System.out.println("Is Sorted : " + isSorted(arr));
        System.out.println("Duplicate Count : " + countDuplicates(arr));
    }
}
