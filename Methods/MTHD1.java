package Methods;

public class MTHD1 {
    private static class Example {
        private int number;
        private String name;
    
        public int getNumber(){
            return number;
        };
    
        public String getName(){
            return name;
        }
    
        public void setName(String name){
            this.name = name;
        };
    
        public void setNumber(int number){
            this.number = number;
        }
    
        public void printDetails(){
            System.out.printf("Number: %d\n", number);
            System.out.printf("Name: %s", name);
        }
    }
    public static void main(String args[]){
        Example example = new Example();

        example.setName("Bernard");
        example.setNumber(33);
        example.printDetails();
    }
}



