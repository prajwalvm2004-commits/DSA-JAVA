
package collectionFramework;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListProblem07InsertIntoSortedList {

    static void insertSorted(LinkedList<Integer> list, int value) {

        // Your logic here
        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()) {
            int current = it.next();

            // What condition tells us to insert before current?
            if(current>value){
                it.previous();
                it.add(value);
                return;
            }
        }it.add(value);

    }

    public static void main(String[] args) {

        LinkedList<Integer> middle = new LinkedList<>();
        middle.add(10);
        middle.add(20);
        middle.add(30);
        middle.add(40);

        LinkedList<Integer> front = new LinkedList<>();
        front.add(20);
        front.add(30);
        front.add(40);

        LinkedList<Integer> end = new LinkedList<>();
        end.add(10);
        end.add(20);
        end.add(30);

        LinkedList<Integer> empty = new LinkedList<>();

        LinkedList<Integer> duplicates = new LinkedList<>();
        duplicates.add(10);
        duplicates.add(20);
        duplicates.add(20);
        duplicates.add(30);

        insertSorted(middle, 25);
        insertSorted(front, 5);
        insertSorted(end, 40);
        insertSorted(empty, 15);
        insertSorted(duplicates, 20);

        System.out.println("Middle: " + middle);
        // [10, 20, 25, 30, 40]

        System.out.println("Front: " + front);
        // [5, 20, 30, 40]

        System.out.println("End: " + end);
        // [10, 20, 30, 40]

        System.out.println("Empty: " + empty);
        // [15]

        System.out.println("Duplicates: " + duplicates);
        // [10, 20, 20, 20, 30]
    }
}
