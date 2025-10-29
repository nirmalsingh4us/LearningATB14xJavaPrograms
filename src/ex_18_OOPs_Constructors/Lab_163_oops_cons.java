package ex_18_OOPs_Constructors;

public class Lab_163_oops_cons {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1);
    }
}
class A{
    //default constructor here is A()
    A (){
        System.out.println("I want to read a.csv file");
        System.out.println("Open the page before loading the scripts");
        System.out.println("You can do anything which you want to do when object is creating");
    }
}