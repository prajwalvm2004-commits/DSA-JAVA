
package collectionFramework;

import java.util.LinkedList;

public class LinkedListProblem05MiddleAndSorted {

    // Return the middle value.
    // For even size, return the second middle.
    // Empty list returns -1.
    static int findMiddle(LinkedList<Integer> list) {

        // Your logic here
        if(list.size()==0){
            return -1;
        }
        int index = list.size() / 2;


        return list.get(index);
    }

    // Return true if elements are in ascending order.
    // Equal consecutive values are allowed.
    static boolean isSorted(LinkedList<Integer> list) {

        // Your logic here
        if(list.size()==0){
            return true;
        }
        boolean first=true;
        int prev = list.getFirst();
        for(int current: list){
            if(first){
                first=false;
                prev=current;
                continue;
            }
            if(prev>current){
                return false;
            }prev=current;

        }

        return true;
    }

    public static void main(String[] args) {

        LinkedList<Integer> odd = new LinkedList<>();
        odd.add(10);
        odd.add(20);
        odd.add(30);
        odd.add(40);
        odd.add(50);

        LinkedList<Integer> even = new LinkedList<>();
        even.add(10);
        even.add(20);
        even.add(30);
        even.add(40);

        LinkedList<Integer> single = new LinkedList<>();
        single.add(7);

        LinkedList<Integer> empty = new LinkedList<>();

        LinkedList<Integer> messy = new LinkedList<>();
        messy.add(10);
        messy.add(30);
        messy.add(20);

        LinkedList<Integer> withEqual = new LinkedList<>();
        withEqual.add(5);
        withEqual.add(5);
        withEqual.add(7);

        LinkedList<Integer> descending = new LinkedList<>();
        descending.add(50);
        descending.add(40);
        descending.add(30);

        // Find middle
        System.out.println("Odd middle: " + findMiddle(odd));       // 30
        System.out.println("Even middle: " + findMiddle(even));     // 30
        System.out.println("Single middle: " + findMiddle(single)); // 7
        System.out.println("Empty middle: " + findMiddle(empty));   // -1

        // Check sorted
        System.out.println("Odd sorted: " + isSorted(odd));               // true
        System.out.println("Messy sorted: " + isSorted(messy));           // false
        System.out.println("Equal values sorted: " + isSorted(withEqual)); // true
        System.out.println("Single sorted: " + isSorted(single));         // true
        System.out.println("Empty sorted: " + isSorted(empty));           // true
        System.out.println("Descending sorted: " + isSorted(descending)); // false
    }
}
