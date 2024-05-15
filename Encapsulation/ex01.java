package Encapsulation;

// Person class
class Person {
    // Encapsulating the name and age
    // only approachable and used using methods defined
    private String name;
    private int age;

    public String getName() { return name; };
    public void setName(String NAME){ name = NAME; };

    public int getAge(){ return age; };
    public void setAge(int AGE){ age = AGE; };
}

public class ex01 {
    public static void main(String args[]){
        Person emma = new Person();
        emma.setName("Emmanuel Donkor");
        emma.setAge(23);
        String Name = emma.getName();
        System.out.println(Name);
        // System.out.println(Name);
    }
}
