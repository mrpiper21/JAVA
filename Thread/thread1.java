package Thread;
import java.util.*;

// A thread is a way the computer use multiple at once

public class thread1 implements Runnable{
    String name;
    int time;
    Random r = new Random();

    public thread1(String x){
        name = x;
        time = r.nextInt(999);
    }

    public void run(){
        try {
            System.out.printf("%s us sleeping for %d", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        }catch (Exception e){

        }
    }
}
