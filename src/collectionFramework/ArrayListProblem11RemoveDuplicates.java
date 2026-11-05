package collectionFramework;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProblem11RemoveDuplicates {

    // Way A: keep the original order
//    static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
//        // write your logic here
//        for(int i=0;i<list.size();i++){
//            for(int j=i+1;j<list.size();j++){
//                if(list.get(i).equals(list.get(j))){
//                    list.remove(j);
//                    j--;
//                }
//            }
//        }
//        return list;
//    }

    // Bonus Way B: order doesn't matter (sort first, then remove neighbours)
    static ArrayList<Integer> removeDuplicatesSorted(ArrayList<Integer> list) {
        // write your logic here
        Collections.sort(list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).equals(list.get(i+1))){
                list.remove(list.get(i+1));
                i--;
            }
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
//        System.out.println(removeDuplicates(makeList(1, 2, 2, 3, 1, 4))); // expected: [1, 2, 3, 4]
//        System.out.println(removeDuplicates(makeList(5, 5, 5)));          // expected: [5]
//        System.out.println(removeDuplicates(makeList(7, 8, 9)));          // expected: [7, 8, 9]
//        System.out.println(removeDuplicates(makeList()));                 // expected: []
//        System.out.println(removeDuplicates(makeList(4, 1, 4, 2, 1)));    // expected: [4, 1, 2]

        System.out.println(removeDuplicatesSorted(makeList(4,1,4,2,1))); // expected: [1, 2, 4]
    }
}