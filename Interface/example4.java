package Interface;
interface Int1 {
    final int x = 10;
    static void display(){
      System.out.println("Hello world");  
    };
}

public class example4 implements In1 {
    @Override public void diplay() {
        // TODO Auto-generated method stub
    }
    public static void main(String args[]){
        Int1.display();
    };
}
