package collectionFramework;

import java.util.LinkedList;

public class LinkedListAddDemo {

    static void addAtFront(LinkedList<Integer> list, int value) {
        // your logic here
        list.addFirst(value);
    }

    static void addAtEnd(LinkedList<Integer> list, int value) {
        // your logic here
        list.addLast(value);
    }

    // position 0 = first spot; return true if added, false if position is not valid
    static boolean addAtPosition(LinkedList<Integer> list, int position, int value) {
        // your logic here

        if (position<=list.size() && position>=0) {
            // add it
            list.add(position,value);
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
        list.add(10);
        list.add(20);
        list.add(30);
        printList(list);                                   // 10 20 30

        addAtFront(list, 5);
        printList(list);                                   // 5 10 20 30

        addAtEnd(list, 40);
        printList(list);                                   // 5 10 20 30 40

        System.out.println(addAtPosition(list, 2, 15));    // true
        printList(list);                                   // 5 10 15 20 30 40

        System.out.println(addAtPosition(list, 6, 50));    // true (position = size, so end)
        printList(list);                                   // 5 10 15 20 30 40 50

        System.out.println(addAtPosition(list, 20, 99));   // false
        System.out.println(addAtPosition(list, -1, 99));   // false
        printList(list);                                   // same as before
    }
}