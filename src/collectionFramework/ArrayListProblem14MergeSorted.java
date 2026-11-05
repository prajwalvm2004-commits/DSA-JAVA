package collectionFramework;
import java.util.Collections;


import java.util.ArrayList;

public class ArrayListProblem14MergeSorted {

    static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        // write your logic here
        ArrayList <Integer> result = new ArrayList<>();
        for(int i=0;i<result.size();i++){
            for(int j=0;j<result.size();j++){
                if(a.get(i) < b.get(j)){
                    result.add(i,a.get(i));
                    i++;
                }else if(a.get(i) > b.get(j)){
                    result.add(i,b.get(j));
                }
            }

        }
        return  result;
    }

    static ArrayList<Integer> makeList(int... nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(mergeSorted(makeList(1, 3, 5), makeList(2, 4, 6)));   // expected: [1, 2, 3, 4, 5, 6]
        System.out.println(mergeSorted(makeList(1, 2, 3), makeList(4, 5, 6)));   // expected: [1, 2, 3, 4, 5, 6]
        System.out.println(mergeSorted(makeList(1, 5, 9), makeList(2)));         // expected: [1, 2, 5, 9]
        System.out.println(mergeSorted(makeList(), makeList(3, 4)));             // expected: [3, 4]
        System.out.println(mergeSorted(makeList(3, 4), makeList()));             // expected: [3, 4]
        System.out.println(mergeSorted(makeList(), makeList()));                 // expected: []
        System.out.println(mergeSorted(makeList(1, 2, 2), makeList(2, 3)));      // expected: [1, 2, 2, 2, 3]
    }
}