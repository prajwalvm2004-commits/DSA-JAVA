package collectionFramework;


import java.util.ArrayList;

public class ArrayListProblem13IsPalindrome {

    static boolean isPalindrome(ArrayList<Integer> list) {
        // write your logic here

        int i=0;
        int j=list.size()-1;

        while(i<j){

             if(!list.get(i).equals(list.get(j))) {
                return false;
            }i++;
             j--;
        }
        return true;
    }

    static ArrayList<Integer> makeList(int... nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n : nums) {
            list.add(n);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(makeList(1, 2, 3, 2, 1)));  // expected: true
        System.out.println(isPalindrome(makeList(1, 2, 2, 1)));     // expected: true
        System.out.println(isPalindrome(makeList(1, 2, 3, 4)));     // expected: false
        System.out.println(isPalindrome(makeList(5)));              // expected: true
        System.out.println(isPalindrome(makeList()));               // expected: true
        System.out.println(isPalindrome(makeList(1000, 5, 1000)));  // expected: true
        System.out.println(isPalindrome(makeList(1, 2, 3, 1)));     // expected: false
    }
}