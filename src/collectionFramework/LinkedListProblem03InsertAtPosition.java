package collectionFramework;
import java.util.LinkedList;

public class LinkedListProblem03InsertAtPosition {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(java.util.Arrays.asList(10,20,40,50));
        list.add(2,30);
        System.out.println(list);
    }

}
