package collectionFramework;
import java.util.ArrayList;

public class ArrayListProblem09FindSecondLargest {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(java.util.Arrays.asList(10,45,20,80,60,80));
        int largest = list.get(0);
        int secondLargest = Integer.MIN_VALUE;
        for(int i=1;i<list.size();i++){
            if(list.get(i) > largest){
                secondLargest = largest;
                largest = list.get(i);
            } else if (list.get(i) > secondLargest && list.get(i) < largest) {
                secondLargest=list.get(i);

            }
        }
        System.out.println("Second largest: " + secondLargest);
    }
}
