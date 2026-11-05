package arrays;

public class ArrayProblem02FindSecondMinAndMax {
    public static int findSecondLargest(int[] arr) {
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest =largest;
                largest =arr[i];
            }else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest =arr[i];
            }
        }return secondLargest;

    }
    public static int findSecondSmallest(int[] arr){
        int smallest=arr[0];
        int secondSmallest =Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest =smallest;
                smallest=arr[i];

            }else if(arr[i]<secondSmallest && arr[i]>smallest){
                secondSmallest =arr[i];
            }
        }return secondSmallest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23, 56, 89, 7};
        System.out.println("Second Largest : " + findSecondLargest(arr));
        System.out.println("Second Smallest : " + findSecondSmallest(arr));

    }
}
