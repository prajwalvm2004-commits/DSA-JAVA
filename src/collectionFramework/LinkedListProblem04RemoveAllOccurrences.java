package collectionFramework;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListProblem04RemoveAllOccurrences {

    public static int removeAllOccurrences(LinkedList<Integer> list, int target) {

        // Your logic here
        Iterator<Integer> it =  list.iterator();
        int count=0;
        while(it.hasNext()){
            int value =it.next();
            if(target==value){
                it.remove();
                count++;
            }
        }



      return count;
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(10);
        list.add(40);

        int removedCount = removeAllOccurrences(list, 10);

        System.out.println("Updated list: " + list);
        System.out.println("Removed count: " + removedCount);
    }
}
