package collectionFramework;
import java.util.LinkedList;

public class LinkedListProblem02PrintReverse {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
         for(int i=list.size()-1;i>=0;i--){
             System.out.println(list.get(i));
         }

    }
}
