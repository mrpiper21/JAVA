package Methods;
import java.util.*;

public class ex02 {
    public static void main(String args[]){
        // conver stuff array to aliist
        String[] stuff = {"apples", "beef", "corn", "ham"};
        List<String> list1 = Arrays.asList(stuff);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("youtube");
        list2.add("google");
        list2.add("digg");

        for(String x : list2){
            System.out.printf("%s ", x);
        }

        Collections.addAll(list2, stuff);

        System.out.println();
        for(String x : list2){
            System.out.printf("%s ", x);
        }

        // frequency: -> checks one list against the other or a list against a term
        // printing the number of times digg appears in list2
        System.out.println(Collections.frequency(list2, "digg"));

        // Disjoin: checks one list against another list and checks true if they have nothing in common
         boolean tof = Collections.disjoint(list1, list2);
         System.out.println(tof);
         if(tof)
             System.out.println("these lists do not have anything in common");
         else
             System.out.println("These lists must have something in common!");
    }
}