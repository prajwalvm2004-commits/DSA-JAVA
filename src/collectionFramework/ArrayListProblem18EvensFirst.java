package collectionFramework;

import java.util.ArrayList;

public class ArrayListProblem18EvensFirst {

    static ArrayList<Integer> evensFirst(ArrayList<Integer> list) {
        // write your logic here
        ArrayList<Integer> even =new ArrayList<>();
        ArrayList<Integer> odd =new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                even.add(list.get(i));
            }else{
                odd.add(list.get(i));
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(even);
        result.addAll(odd);
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
        System.out.println(evensFirst(makeList(3, 1, 2, 4, 5, 6)));   // expected: [2, 4, 6, 3, 1, 5]
        System.out.println(evensFirst(makeList(1, 3, 5)));            // expected: [1, 3, 5]
        System.out.println(evensFirst(makeList(2, 4, 6)));            // expected: [2, 4, 6]
        System.out.println(evensFirst(makeList(5, 4)));               // expected: [4, 5]
        System.out.println(evensFirst(makeList(7)));                  // expected: [7]
        System.out.println(evensFirst(makeList()));                   // expected: []
        System.out.println(evensFirst(makeList(-3, -4, 0, 9, 8)));    // expected: [-4, 0, 8, -3, 9]
    }
}
