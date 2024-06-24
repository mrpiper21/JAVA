package Hashset;
import java.util.*;

// A set is a collection that cannot contain duplicate items.
// We use Hashset which takes a collection of list, finds duplicate items and remove them
// and return a new collection.
public  class Hashing {
    public static void main(String args[]){
        String[] things = {"apple", "bob", "ham", "bob", "bacon"};
        List<String> list = Arrays.asList(things);

        System.out.printf("%s ", list);
        System.out.println();

        // using hashset to remove duplicate items
        Set<String> set = new HashSet<String>(list);
        System.out.printf("%s ", set);

    }
}