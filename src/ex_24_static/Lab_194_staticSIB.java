package ex_24_static;

public class Lab_194_staticSIB {
    public static void main(String[] args) {
        A a= new A();
    }
}

class A{
    static {
        System.out.println("Called only when class is loaded");
        System.out.println("You can write a code reading excel,file,database");
    }

    static int a=10;
    static void m1(){
        System.out.println("Static Function");
    }
}
