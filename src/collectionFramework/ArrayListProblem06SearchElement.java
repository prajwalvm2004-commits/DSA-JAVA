package collectionFramework;
import java.util.ArrayList;

public class ArrayListProblem06SearchElement {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(java.util.Arrays.asList(10,25,30,45,50));

        int target =30;
        boolean found = false;
        for(int i=0;i<list.size();i++){

            if(target == list.get(i)){
               found=true;
               break;
            }
        }
        if(found){
            System.out.println("Element found");

        }else{
            System.out.println("Element NOT found");

        }

    }
}
