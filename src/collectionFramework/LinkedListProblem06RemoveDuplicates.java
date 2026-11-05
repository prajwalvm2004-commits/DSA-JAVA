
package collectionFramework;

import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;

public class LinkedListProblem06RemoveDuplicates {

    // Remove duplicates while preserving first appearances.
    // Return the number of elements removed.
    static int removeDuplicates(LinkedList<Integer> list) {

        // Your logic here
        HashSet<Integer> seen = new HashSet<>();
        Iterator<Integer> it = list.iterator();


        int count=0;
        while(it.hasNext()){
            int value=it.next();
            if(!seen.add(value)){
                it.remove();
                count++;
            }
        }



        return count;
    }

    public static void main(String[] args) {

        LinkedList<Integer> normal = new LinkedList<>();
        normal.add(4);
        normal.add(2);
        normal.add(4);
        normal.add(3);
        normal.add(2);
        normal.add(5);
        normal.add(3);

        LinkedList<Integer> noDuplicates = new LinkedList<>();
        noDuplicates.add(1);
        noDuplicates.add(2);
        noDuplicates.add(3);

        LinkedList<Integer> allSame = new LinkedList<>();
        allSame.add(7);
        allSame.add(7);
        allSame.add(7);
        allSame.add(7);

        LinkedList<Integer> single = new LinkedList<>();
        single.add(9);

        LinkedList<Integer> empty = new LinkedList<>();

        System.out.println("Normal: " + removeDuplicates(normal)
                + " removed, list = " + normal); // 3 removed: [4, 2, 3, 5]

        System.out.println("No duplicates: " + removeDuplicates(noDuplicates)
                + " removed, list = " + noDuplicates); // 0 removed

        System.out.println("All same: " + removeDuplicates(allSame)
                + " removed, list = " + allSame); // 3 removed: [7]

        System.out.println("Single: " + removeDuplicates(single)
                + " removed, list = " + single); // 0 removed

        System.out.println("Empty: " + removeDuplicates(empty)
                + " removed, list = " + empty); // 0 removed
    }
}
