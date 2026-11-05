package collectionFramework;
import java.util.ArrayList;

public class ArrayListProblem04FindLargestElement {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(75);
        list.add(40);
        list.add(60);

        int largest = list.get(0);

        for(int i=1;i<list.size();i++){
            if(list.get(i) > largest){
                largest =list.get(i);
            }
        }
        System.out.println("Largest Element : " + largest);
    }
}
