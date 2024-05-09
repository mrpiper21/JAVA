class Test {
    public static void main(String []args){
        String Hello = "hello";
        String[] MyArr = new String[10];
        MyArr[1] = "Hoal";
        System.out.println(MyArr[1]);
        System.out.println(Hello);
        System.out.println("My first Java Program.");

        // Declaring array literal 
        int []IntArray = new int[]{ 3,3,4,8,9, 0 };
        for (int i = 0; i < IntArray.length; i++){
            System.out.println("index: " + i + "value: " + IntArray[i]);
        }

        //
        student[] arr;
        arr = new student[5];
        arr[0] = new student(0, "num");
        arr[1] = new student(1, "Husbon");
        arr[2] = new student(2, "Yaw");
        arr[3] = new student(3, "Kofi");
        arr[4] = new student(4, "John");

        for(int i = 0; i < arr.length; i++){
            System.out.println("Elemet at " + i + arr[i].name + ":" + arr[i].roll_no);
        }

        //employee objects
        // Initializing an array of employee object
        Employee[] employee;
        employee = new Employee[3];
        employee[0] = new Employee("Emma", "spintex", 033);
        employee[1] = new Employee("Tema", "Japan", 888);
        employee[2] = new Employee("Hanah", "tokyo", 0);

        for (int i = 0; i < employee.length; i++){
            System.out.println(employee[i].name);
        }
    }
};

// Java program to illustrate creating
//  an array of objects

class student {
    public int roll_no;
    public String name;
    student (int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    };
};

class Employee {
    public String name;
    public String Location;
    public int phon_no;
    Employee(String NAME, String LOCATION, int PHONE){
        this.name = NAME;
        this.Location = LOCATION;
        this.phon_no = PHONE;

    };
};