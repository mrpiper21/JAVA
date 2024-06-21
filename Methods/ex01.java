package Methods;
import java.util.*;

public class ex01{
    public static void main(String args[]){
        // create an array and convert to list
        Character[] ray = {'r', 't', 'k'};
        List<Character> l = Arrays.asList(ray);
        System.out.println("List is : ");
        output(l);

        // reverse and print out the list
        Collections.reverse(l);
        System.out.println("After reverse : ");
        output(l);

        // create new array and a new list
        Character[] newRay = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);

        // copy contents of list into list copy
        Collections.copy(listCopy, l);

    }
}