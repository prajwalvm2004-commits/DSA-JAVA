package collectionFramework;

import java.util.ArrayList;

public class ArrayListProblem17PairWithSum {

    static ArrayList<Integer> findPair(ArrayList<Integer> list, int target) {
        // write your logic here
        ArrayList<Integer> pair = new ArrayList<>();

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j) == target){
                    pair.add(list.get(i));   // first number
                    pair.add(list.get(j));// second number
                    return pair;
                }
            }
        }
        return pair;

    }

    static ArrayList<Integer> makeList(int... nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findPair(makeList(2, 7, 11, 15), 9));    // expected: [2, 7]
        System.out.println(findPair(makeList(3, 2, 4), 6));         // expected: [2, 4]
        System.out.println(findPair(makeList(1, 2, 3), 10));        // expected: []
        System.out.println(findPair(makeList(3, 3), 6));            // expected: [3, 3]
        System.out.println(findPair(makeList(5), 10));              // expected: []
        System.out.println(findPair(makeList(), 5));                // expected: []
        System.out.println(findPair(makeList(-1, 4, 6, -3), 3));    // expected: [-1, 4]
        System.out.println(findPair(makeList(4, 1, 5, 3), 8));      // expected: [5, 3]
    }
}