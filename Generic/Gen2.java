package Generic;
import java.util.*;

// using Generic return type
public class Gen2 {
    public static void main(String args[]){
        System.out.println(max(23, 42, 1));
        System.out.println(max("gen", "ben", "teal"));
    }
    private static <T extends Comparable<T>> T max(T arg1, T arg2, T arg3){
        T m = arg1;
        if(arg2.compareTo(arg1) > 0)
            m = arg2;
        if(arg3.compareTo(m) > 0)
            m = arg3;

        return m;
    }
}