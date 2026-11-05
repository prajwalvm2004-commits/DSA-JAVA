package collectionFramework;
import java.util.LinkedList;


public class LinkedListProblem04RemoveEverySecondElement {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(java.util.Arrays.asList(10,20,30,40,50,60));
        for(int i=list.size()-1;i>=0;i--){
           if(i%2!=0){
              list.remove(i);

           }
        }System.out.println(list);

    }
}
