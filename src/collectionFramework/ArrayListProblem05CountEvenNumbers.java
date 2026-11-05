package collectionFramework;
import java.util.ArrayList;

public class ArrayListProblem05CountEvenNumbers {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(12);
        list.add(7);
        list.add(8);
        list.add(15);
        list.add(20);
        list.add(33);
        list.add(44);

        int count =0;
        for(int i=0;i<list.size();i++){
            if(list.get(i) % 2 == 0){
                count++;
            }
        }
        System.out.println("Even numbers count = " + count);
    }
}
