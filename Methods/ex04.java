package Methods;
import java.util.*;

public class ex04 {
    public static void main(String args[]){
        // priority queue
        PriorityQueue<String> q = new PriorityQueue<String>();

        q.offer("first");
        q.offer("second");
        q.offer("third");
        System.out.printf("%s ", q);
        System.out.println();

        // printing el of highest priority
        System.out.printf("%s ", q.peek());
        System.out.println();

        // removing el of highest priority
        q.poll();
        System.out.printf("%s ", q);
    }
}