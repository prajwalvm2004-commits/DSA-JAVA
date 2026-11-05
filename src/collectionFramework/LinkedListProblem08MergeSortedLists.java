
package collectionFramework;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListProblem08MergeSortedLists {

    static LinkedList<Integer> mergeSorted(
            LinkedList<Integer> list1,
            LinkedList<Integer> list2) {

        LinkedList<Integer> result = new LinkedList<>();
        Iterator<Integer> it1=list1.iterator();
        Iterator<Integer> it2=list2.iterator();
        if (list1.isEmpty()) {
            return new LinkedList<>(list2);
        }

        if (list2.isEmpty()) {
            return new LinkedList<>(list1);
        }

        // Your logic here
        int value1=it1.next();
        int value2=it2.next();

       while(true){
           if(value1<value2){
               result.add(value1);
               if(it1.hasNext()){
                   value1=it1.next();
               }else{
                   break;
               }
           }else{
               result.add(value2);
               if(it2.hasNext()){
                   value2=it2.next();
               }else break;
           }


       }
       while(it1.hasNext()){
           result.add(it1.next());
       }
       while(it2.hasNext()){
           result.add(it2.next());
       }

        return result;
    }

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        System.out.println(mergeSorted(list1, list2));
        // Expected: [1, 2, 3, 4, 5, 6, 7, 8]

        LinkedList<Integer> empty = new LinkedList<>();
        LinkedList<Integer> single = new LinkedList<>();
        single.add(5);

        System.out.println(mergeSorted(empty, single));
        // Expected: [5]

        System.out.println(mergeSorted(empty, empty));
        // Expected: []

        LinkedList<Integer> duplicates1 = new LinkedList<>();
        duplicates1.add(1);
        duplicates1.add(2);
        duplicates1.add(2);

        LinkedList<Integer> duplicates2 = new LinkedList<>();
        duplicates2.add(2);
        duplicates2.add(3);

        System.out.println(mergeSorted(duplicates1, duplicates2));
        // Expected: [1, 2, 2, 2, 3]

        System.out.println("Original list1: " + list1);
        // Expected: [1, 3, 5, 7]
    }
}
