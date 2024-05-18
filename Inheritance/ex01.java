package Inheritance;

class Bycicle {
    // this bycicle class has two fields
    public int gear;
    public int speed;

    // the bycicle class has one constructor
    public Bycicle(int GEAR, int SPEED){
        this.gear = GEAR;
        this.speed = SPEED;
    };

    // the bycicle class has three methods
    public void applyBreak(int DECREMENT){
        speed -= DECREMENT;
    };

    public void speedUp(int INCREMENT){
        speed += INCREMENT;
    };

    public String toString(){
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    };
}

class MountainBike extends Bycicle {
    public int seatHeight;

    public MountainBike(int GEAR, int SPEED, int STARTHEIGHT){
        // invoking base-class(Bicycle) constructor
        super(GEAR, SPEED);
        seatHeight = STARTHEIGHT;
    }

    public void setHeight(int newValue){
        seatHeight = newValue;
    };

    //overidding toString() method of Bicycle to print more info
    @Override public String toString(){
        return (super.toString() + "\nseat height is " + seatHeight);
    }
}

public class ex01 {
    public static void main (String args[]){
        MountainBike mb = new MountainBike(6, 300, 15);
        System.out.println(mb.toString());
    }
}
