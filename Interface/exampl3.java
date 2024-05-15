package Interface;

interface API {
    default void show(){
        System.out.println("Default API");
    }
}

interface Interface1 extends API{
    // Abstract method
    void display();
}

interface Interface2 extends API{
    // Abstract method
    void print();
}

public class exampl3 implements Interface1, Interface2 {
    // Overriding the abstract method from Interface1
    public void display(){
        System.out.println("Display from Interface1");
    };

    public void print(){
        System.out.println("Print from Interface2");
    };

    public static void main(String args[]){
        // Creating object of third class in main() method

        exampl3 d = new exampl3();
        // calling the methods from both interfaces
        d.show();
        d.display();
        d.print();
    }
}
