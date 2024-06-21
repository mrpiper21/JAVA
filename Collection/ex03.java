package Collection;
import java.util.*;

public class ex03 {
    public static void main(String args[]){
        String[] arr = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();

        // add array items to list
        for(String x: arr){
            list1.add(x);
        }

        String[] moreArr  = {"lasers", "hats"};
        List<String> list2 = new ArrayList<String>();

        // add array items to list
        for(String y : moreArr){
            list2.add(y);
        }

        // print out list 1
//        for(int i = 0; i < list1.size(); i++){
//            System.out.printf("%s ", list1.get(i), "\n");
//        }

        editlist(list1, list2);

        // print out list 1
        for(int i = 0; i < list1.size(); i++){
            System.out.printf("%s ", list1.get(i));
        }
    }

    public static void editlist(List<String> l1, List<String> l2){
        Iterator<String> it = l1.iterator();
        while (it.hasNext()){
            if(l2.contains(it.next())){
                it.remove();
            }
        }
    }
}