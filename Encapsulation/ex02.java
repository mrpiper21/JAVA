package Encapsulation;

class Area {
    int length;
    int breadth;

    // constructor to initialize values
    Area(int LENGTH, int BREADTH){
        this.length = LENGTH;
        this.breadth = BREADTH;
    };

    // method to calculate are
    public void getArea(){
        int area = length * breadth;
        System.out.println("Area is: " + area);
    }
}

public class ex02 {
    public static void main(String args[]){
        Area Square = new Area(5, 4);
        Square.getArea();

        Area Rectangle = new Area(15, 7);
        Rectangle.getArea();
    }
}
