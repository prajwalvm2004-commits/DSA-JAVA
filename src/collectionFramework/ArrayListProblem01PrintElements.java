package collectionFramework;
import java.util.ArrayList;

public class ArrayListProblem01PrintElements {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
