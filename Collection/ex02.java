package Collection;

import java.util.*;

public class ex02 {
    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>(4);

        arr.add(5);
        arr.add(4);
        System.out.println(arr.size());

        List<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(22);
        al.add(28);
        al.add(5);
        al.add(78);
        System.out.println(al);

        // Removing element by index
        al.remove(1);
        System.out.println(al);

        // removing element by value or element
        al.remove(Integer.valueOf((78)));
        System.out.println(al);
    }
}
