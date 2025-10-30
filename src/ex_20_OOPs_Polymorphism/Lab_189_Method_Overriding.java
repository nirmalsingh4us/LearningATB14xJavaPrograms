package ex_20_OOPs_Polymorphism;

public class Lab_189_Method_Overriding {
    public static void main(String[] args) {
//    this is called runtime polymorphism
//        Nirmal ns = new Nirmal();
//        ns.home();

//        Father f1 = new Father();
//        f1.home();

        Father f2 = new Nirmal(); // This is called dynamic dispatch
        f2.home();
    }
}

class Father {
    void home()
    {
        System.out.println("4BHK");
    }
}

class Nirmal extends Father {
    void home(){
        System.out.println("3BHK");
    }
}
