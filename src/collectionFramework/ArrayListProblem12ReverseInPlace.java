package collectionFramework;

import java.util.ArrayList;

public class ArrayListProblem12ReverseInPlace {

    static ArrayList<Integer> reverseInPlace(ArrayList<Integer> list) {
        // write your logic here
        if(list.size() ==0){
            return list;
        }
        int i=0;
        int j=list.size()-1;
        while(i<j){

            int temp =list.get(j);
            list.set(j,list.get(i));
            list.set(i,temp);
            i++;
            j--;
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
        System.out.println(reverseInPlace(makeList(1, 2, 3, 4, 5))); // expected: [5, 4, 3, 2, 1]
        System.out.println(reverseInPlace(makeList(1, 2, 3, 4)));    // expected: [4, 3, 2, 1]
        System.out.println(reverseInPlace(makeList(7)));             // expected: [7]
        System.out.println(reverseInPlace(makeList()));              // expected: []
        System.out.println(reverseInPlace(makeList(2, 2, 9)));       // expected: [9, 2, 2]
    }
}
