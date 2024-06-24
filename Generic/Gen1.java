package Generic;
import java.util.*;

// Generics are used to remove overloaded methods
public class Gen1 {
    public static void main(String args[]){
        Integer[] iarr = {1,2,3,4};
        Character[] carr = {'b', 't', 'c', 'w'};

        printMe(iarr);
        printMe(carr);
    }

    //generic method
    public static <T> void printMe(T[] x){
        for(T b : x){
            System.out.printf("%s ", b);
        }System.out.println();
    }
    /* Overloaded Methods */
//    private static void printMe(Integer [] i){
//        for (Integer x : i){
//            System.out.printf("%s ", x);
//        }
//        System.out.println();
//    }
//    private static void printMe(Character [] i){
//        for (Character x : i){
//            System.out.printf("%s ", x);
//        }
//        System.out.println();
//    }
}