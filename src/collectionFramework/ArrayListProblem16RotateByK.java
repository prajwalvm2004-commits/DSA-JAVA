package collectionFramework;

import java.util.ArrayList;

public class ArrayListProblem16RotateByK {

    static ArrayList<Integer> rotateRight(ArrayList<Integer> list, int k) {
        // write your logic here
        if(list.size()==0){
            return list;
        }
        k = k % list.size();

        for(int i=0;i<k;i++){
            int last = list.remove(list.size()-1);
            list.add(0,last);

        }
        return list;
    }
    static ArrayList<Integer> rotateLeft(ArrayList<Integer> list, int k) {
        if (list.size() == 0) {
            return list;
        }
        k = k % list.size();

        for (int i = 0; i < k; i++) {
            int first = list.remove(0);
            list.add(first);
        }
        return list;
    }

    static ArrayList<Integer> makeList(int... nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }
        return list;
    }

    public static void main(String[] args) {
       System.out.println(rotateRight(makeList(1, 2, 3, 4, 5), 2));   // expected: [4, 5, 1, 2, 3]
        System.out.println(rotateRight(makeList(1, 2, 3, 4, 5), 1));   // expected: [5, 1, 2, 3, 4]
        System.out.println(rotateRight(makeList(1, 2, 3, 4, 5), 0));   // expected: [1, 2, 3, 4, 5]
        System.out.println(rotateRight(makeList(1, 2, 3, 4, 5), 5));   // expected: [1, 2, 3, 4, 5]
        System.out.println(rotateRight(makeList(1, 2, 3, 4, 5), 7));   // expected: [4, 5, 1, 2, 3]
        System.out.println(rotateRight(makeList(1, 2), 3));            // expected: [2, 1]
        System.out.println(rotateRight(makeList(9), 4));               // expected: [9]
        System.out.println(rotateRight(makeList(), 3));
        System.out.println(rotateLeft(makeList(1, 2, 3, 4, 5), 2));   // expected: [3, 4, 5, 1, 2]
        System.out.println(rotateLeft(makeList(1, 2, 3, 4, 5), 1));   // expected: [2, 3, 4, 5, 1]
        System.out.println(rotateLeft(makeList(1, 2, 3, 4, 5), 5));   // expected: [1, 2, 3, 4, 5]
        System.out.println(rotateLeft(makeList(1, 2, 3, 4, 5), 7));   // expected: [3, 4, 5, 1, 2]
        System.out.println(rotateLeft(makeList(), 3));                // expected: []// expected: []
    }
}