package collectionFramework;

import java.util.LinkedList;

public class LinkedListSearchDemo {

    // return first position of target, or -1 if not found
    static int findFirst(LinkedList<Integer> list, int target) {
        // your logic here
       int index=0;
       for(int value:list){
           if(target==value){
               return index;
           }index++;
       }
       return -1;
    }

    // return last position of target, or -1 if not found
    static int findLast(LinkedList<Integer> list, int target) {
        // your logic here
        int index = 0;
        int last = -1;

        for (int value : list) {
          if(target==value){
              last=index;
          }
            index++;
        }
        return last;

    }

    // return how many times target appears
    static int countOccurrences(LinkedList<Integer> list, int target) {
        // your logic here
        int count=0;
       for(int value:list){
           if(target==value){
               count++;
           }
       }
        return count;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(20);
        System.out.println(list);                           // [10, 20, 30, 20, 40, 20]

        System.out.println(findFirst(list, 20));            // 1
        System.out.println(findFirst(list, 40));            // 4
        System.out.println(findFirst(list, 99));            // -1

        System.out.println(findLast(list, 20));             // 5
        System.out.println(findLast(list, 10));             // 0
        System.out.println(findLast(list, 99));             // -1

        System.out.println(countOccurrences(list, 20));     // 3
        System.out.println(countOccurrences(list, 99));     // 0

        LinkedList<Integer> empty = new LinkedList<>();
        System.out.println(findFirst(empty, 20));           // -1
        System.out.println(countOccurrences(empty, 20));    // 0
    }
}