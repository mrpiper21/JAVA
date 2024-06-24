package Thread;

public class Bucky {
    public static void main(String args[]){
        Thread t1 = new Thread(new thread1("one"));
        Thread t2 = new Thread(new thread1("two"));
        Thread t3 = new Thread(new thread1("three"));
        Thread t4 = new Thread(new thread1("four"));
        Thread t5 = new Thread(new thread1("five"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}