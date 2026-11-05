package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverseRemoveDemo {

    // return a NEW list in reverse order; the original must stay the same
    static LinkedList<Integer> reverseCopy(LinkedList<Integer> list) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int value : list) {
            result.addFirst(value);       // each new person goes to the front
        }
        return result;
    }

    // remove every element equal to target; return how many were removed
    static int removeAllOccurrences(LinkedList<Integer> list, int target) {
        Iterator<Integer> it = list.iterator();   // teacher starts at the front
        int count = 0;

        while (it.hasNext()) {                    // anyone left to check?
            int value = it.next();                // move to the next person
            if (value == target) {                // matches the photo?
                it.remove();                      // send him out
                count++;                          // note it down
            }
        }
        return count;
    }

    static void printList(LinkedList<Integer> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(20);
        printList(list);                                    // [10, 20, 30, 20, 40, 20]

        LinkedList<Integer> rev = reverseCopy(list);
        printList(rev);                                     // [20, 40, 20, 30, 20, 10]
        printList(list);                                    // [10, 20, 30, 20, 40, 20] (original unchanged)

        System.out.println(removeAllOccurrences(list, 20)); // 3
        printList(list);                                    // [10, 30, 40]

        System.out.println(removeAllOccurrences(list, 99)); // 0
        printList(list);                                    // [10, 30, 40]

        LinkedList<Integer> empty = new LinkedList<>();
        printList(reverseCopy(empty));                      // []
        System.out.println(removeAllOccurrences(empty, 5)); // 0
    }
}