package Interface;

interface In1 {
    // public, static and fianl
    final int a = 10;

    // public and abstract
    void diplay();
}

class example_1 implements In1 {
    
    public void diplay(){
        System.out.println("Geeks");
    }

    public static void main(String args[]){
        example_1 t = new example_1();
        t.diplay();
        System.out.printf("%d", a);
    }
}
