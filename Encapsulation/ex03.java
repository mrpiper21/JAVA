package Encapsulation;

class Encapsulate {
    private String geekName;
    private int geekRoll;
    private int geekAge;

    // method for age to access
    public int getAge(){ return geekAge; };
    public void setAge(int AGE){ geekAge = AGE; };

    // method for name access
    public String getName(){ return geekName; };
    public void seName(String NAME){ geekName = NAME; };

    // method for roll access
    public int getRoll(){ return geekRoll;};
    public void setRoll(int newRoll){ geekRoll = newRoll; };
}

public class ex03 {
    public static void main(String args[]){
        Encapsulate obg = new Encapsulate();
        obg.seName("Bernard Baah");
        obg.setAge(22);
        obg.setRoll(4);
        String Name = new String(obg.getName());
        System.out.println("Name: " + Name);
    }
}
