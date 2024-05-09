package Strings;
 // There are two ways to create a string
  // 1. String literal -> To make Java more memory efficient (because no new
  // objects are created if it exists already in the string constant pool
 // 2. Using new Keyword -> In such a case, JVM will create a new string object in normal
 // (non-pool) heap memory and the literal “Welcome” will be placed in the string constant pool. The variable s will refer to the object in the heap (non-pool)

public class String_1 {
    public static void main(String args[]){
        String StringLiteral = "hello Letral";
        String lt = "yolo";
        System.out.println(StringLiteral.contains(lt));

        String NewKeyString = new String("Hello new String key");
        NewKeyString = "hola";
        StringLiteral = "Jimmy".intern();
        System.out.println(StringLiteral.charAt(3));
        // returning Strings from index 2
        System.out.println(StringLiteral.substring(2));
        System.out.println(StringLiteral + " " + NewKeyString);


        //Immutable String
        NewKeyString.concat(StringLiteral);
        System.out.println(NewKeyString);
    };

}
