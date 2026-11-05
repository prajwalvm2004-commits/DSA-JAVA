package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackProblem01BasicsDemo {


    // push every value of the array, in order
    static void pushAll(Deque<Integer> stack, int[] values) {
        // your logic here

        for(int value:values){
            stack.push(value);
        }

    }

    // remove and return the top; return -1 if the stack is empty
    static int popTop(Deque<Integer> stack) {
        // your logic here
        if(stack.isEmpty()){
            return -1;
        }

        return stack.pop();
    }

    // return the top without removing it; return -1 if the stack is empty
    static int peekTop(Deque<Integer> stack) {
        // your logic here
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }

    // reverse the text using a stack
    static String reverseString(String text) {
        // your logic here
        Deque<Character> stack = new ArrayDeque<>();
        for(char ch:text.toCharArray()){
            stack.push(ch);
        }
        return "";
    }

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        pushAll(stack, new int[]{10, 20, 30});
        System.out.println(stack);                      // [30, 20, 10]  (top is on the left)

        System.out.println(peekTop(stack));             // 30
        System.out.println(stack);                      // [30, 20, 10]  (peek removes nothing)

        System.out.println(popTop(stack));              // 30
        System.out.println(popTop(stack));              // 20
        System.out.println(stack);                      // [10]

        System.out.println(popTop(stack));              // 10
        System.out.println(popTop(stack));              // -1
        System.out.println(peekTop(stack));             // -1

        System.out.println(reverseString("hello"));     // olleh
        System.out.println(reverseString("a"));         // a
        System.out.println(reverseString(""));          // (empty line)
    }
}