package collectionFramework;

import java.util.ArrayList;

public class ArrayListProblem17BFindAllPairs {

    static ArrayList<ArrayList<Integer>> findAllPairs(ArrayList<Integer> list, int target) {
        // write your logic here
        ArrayList<ArrayList<Integer>> allPairs = new ArrayList<>();

        for(int i=0;i<list.size();i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i) + list.get(j) == target) {
                    ArrayList<Integer> pair = new ArrayList<>();

                    pair.add(list.get(i));   // first number
                    pair.add(list.get(j));// second number
                    allPairs.add(pair);
                }
            }

        }

        return allPairs;
    }

    static ArrayList<Integer> makeList(int... nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findAllPairs(makeList(1, 2, 3, 4, 5), 6));          // expected: [[1, 5], [2, 4]]
        System.out.println(findAllPairs(makeList(2, 7, 11, 15), 9));           // expected: [[2, 7]]
        System.out.println(findAllPairs(makeList(1, 2, 3), 10));               // expected: []
        System.out.println(findAllPairs(makeList(), 5));                       // expected: []
        System.out.println(findAllPairs(makeList(1, 5, 2, 4, 3), 6));          // expected: [[1, 5], [2, 4]]
        System.out.println(findAllPairs(makeList(-1, 4, 6, -3, 0, 3), 3));     // expected: [[-1, 4], [6, -3], [0, 3]]
        System.out.println(findAllPairs(makeList(3, 3, 3), 6));                // expected: [[3, 3], [3, 3], [3, 3]]
    }
}
