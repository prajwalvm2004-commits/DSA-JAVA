package collectionFramework;

import java.util.ArrayList;

public class ArrayListProblem15CommonElements {

    static ArrayList<Integer> commonElements(ArrayList<Integer> a, ArrayList<Integer> b) {
        // write your logic here
        ArrayList<Integer> result = new ArrayList<>();
       for(int i=0;i<a.size();i++) {
           if (b.contains(a.get(i)) && !result.contains(a.get(i))) {
               result.add(a.get(i));
           }
       }
        return result;
    }

    static ArrayList<Integer> makeList(int... nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(commonElements(makeList(1, 2, 3, 4), makeList(3, 4, 5, 6)));   // expected: [3, 4]
        System.out.println(commonElements(makeList(1, 2, 2, 3), makeList(2, 2, 4)));      // expected: [2]
        System.out.println(commonElements(makeList(1, 2, 3), makeList(4, 5, 6)));         // expected: []
        System.out.println(commonElements(makeList(5, 5, 5), makeList(5)));               // expected: [5]
        System.out.println(commonElements(makeList(), makeList(1, 2)));                   // expected: []
        System.out.println(commonElements(makeList(1, 2), makeList()));                   // expected: []
        System.out.println(commonElements(makeList(9, 8, 7), makeList(7, 9)));            // expected: [9, 7]
        System.out.println(commonElements(makeList(1000, 2000), makeList(1000)));         // expected: [1000]
    }
}
