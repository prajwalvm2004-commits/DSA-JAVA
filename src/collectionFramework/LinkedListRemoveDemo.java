package collectionFramework;

import java.util.LinkedList;

public class LinkedListRemoveDemo {

    // return true if removed, false if the list is empty
    static boolean removeFromFront(LinkedList<Integer> list) {
        // your logic here
        if(list.isEmpty()){
            return false;
        }
        list.removeFirst();
        return true;
    }

    // return true if removed, false if the list is empty
    static boolean removeFromEnd(LinkedList<Integer> list) {
        // your logic here
        if(list.isEmpty()){
            return false;
        }
        list.removeLast();
        return true;
    }

    // position 0 = first; return true if removed, false if position is not valid
    static boolean removeAtPosition(LinkedList<Integer> list, int position) {
        // your logic here
        if(position<list.size() && position>=0){
            list.remove(position);
            return true;

        }
        return false;
    }

    static void printList(LinkedList<Integer> list) {
        // your logic here
        System.out.println(list);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        printList(list);                                    // 5 10 15 20 30 40 50

        System.out.println(removeFromFront(list));          // true
        printList(list);                                    // 10 15 20 30 40 50

        System.out.println(removeFromEnd(list));            // true
        printList(list);                                    // 10 15 20 30 40

        System.out.println(removeAtPosition(list, 2));      // true
        printList(list);                                    // 10 15 30 40

        System.out.println(removeAtPosition(list, 4));      // false
        System.out.println(removeAtPosition(list, -1));     // false
        printList(list);                                    // 10 15 30 40

        LinkedList<Integer> empty = new LinkedList<>();
        System.out.println(removeFromFront(empty));         // false
        System.out.println(removeFromEnd(empty));           // false
    }
}