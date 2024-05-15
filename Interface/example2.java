package Interface;

interface Verhicle {
    void changGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Verhicle {
    int speed = 0;
    int gear = 0;

    @Override public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override public void changGear(int newGear){
        gear = newGear;
    }

    @Override public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}

class MotorBike implements Verhicle{
    int gear;
    int speed;

    @Override public void speedUp(int increment){
        speed = speed + increment;
    }

    @Override public void changGear(int newGear){
        gear = newGear;
    }

    @Override public void applyBrakes(int decrement){
        speed -= decrement;
    }

    public void printState(){
        System.out.println("Speed: " + speed + " gear: " + gear);
    }
}

class example2 {
    public static void main(String args[]){
        Bicycle bicycle = new Bicycle();
        bicycle.changGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        System.out.print("bicycle State: ");
        bicycle.printStates();

        MotorBike motor = new MotorBike();
        motor.changGear(4);
        motor.speedUp(6);
        System.out.print("Motor state: ");
        motor.printState();
    }
}
