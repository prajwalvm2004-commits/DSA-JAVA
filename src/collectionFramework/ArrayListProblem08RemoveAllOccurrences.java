package collectionFramework;
import java.util.ArrayList;


public class ArrayListProblem08RemoveAllOccurrences {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(40);
        list.add(20);
        list.add(50);

        int target =20;
//        for(int i =0;i<list.size();i++){
//            if(target == list.get(i)){
//                list.remove(i);
//                i--;
//            }
//        }
        for(int i=list.size()-1;i>=0;i--){
            if(target == list.get(i)){
                list.remove(i);
            }
        }


        System.out.println(list);
    }
}
