package collectionFramework;
import java.util.ArrayList;

public class ArrayListProblem10MoveZerosToEnd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(java.util.Arrays.asList(0, 10, 0, 20, 30, 0, 40));
        int slow = 0;

        for( int  fast=0;fast<list.size();fast++) {
//            if(list.get(fast) == 0 && list.get(slow)==0){
//
//
//            }else if(list.get(fast)!=0 && list.get(slow)==0){
//                int temp = list.get(slow);
//                list.set(slow,list.get(fast));
//                list.set(fast,temp);
//                slow++;
//            }else if(list.get(slow)!=0 && list.get(fast)==0){
//
//            }else{
//                slow++;
//
//            }
            if(list.get(fast)!=0){
                int temp =list.get(slow);
                list.set(slow,list.get(fast));
                list.set(fast,temp);
                slow++;
            }

        }
        System.out.println(list);
    }
}
