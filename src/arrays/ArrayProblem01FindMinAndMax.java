package arrays;


public class ArrayProblem01FindMinAndMax {
    public static int findLargest(int[] arr){
        int largest =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }return largest;
    }
    public static int findSmallest(int[] arr){
        int smallest =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }return smallest;
    }
    public static void main(String[] args) {
       int[] arr ={12,45,7,89,23,56};

       System.out.println("Largest : " + findLargest(arr));
       System.out.println("Smallest : " + findSmallest(arr));
    }
}
