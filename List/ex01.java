package List;
import java.util.*;

public class ex01{
    public static void main(String args[]){
        String[] stuff = {"babies", "watermelon", "melons", "fudge"};
        //Converting Array to list
        LinkedList<String> thelist = new LinkedList<String>(Arrays.asList(stuff));

        thelist.add("pumbkin");
        thelist.addFirst("firstthing");

        // convert back to an array
        stuff = thelist.toArray(new String[thelist.size()]);
        for(String x : stuff){
            System.out.printf("%s ", x);
        }

        // Collection Method sort

        String[] crap = {"apples", "lemons", "geese", "bacon", "youtube"};
        List<String> l1 = Arrays.asList(crap);

        Collections.sort(l1);
        System.out.printf("%s\n", l1);

        //sorting in descending order

        Collections.sort(l1, Collections.reverseOrder());
        System.out.printf("%s\n", l1);
    }
}