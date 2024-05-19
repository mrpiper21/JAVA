package Collection;

import java.util.ArrayList;
import java.io.*;

public class ex01 {
    public static void main(String args[]) {
        // Creating an empty array list with an initial capacity
        ArrayList<Integer> arrList = new ArrayList<Integer>(5);

        // using add method to add element to the array
        arrList.add(4);
        arrList.add(3);
        arrList.add(99);

        // Print all element in the array
        for (Integer number : arrList) {
            System.out.println("Number = " + number);
        }

    }
}
