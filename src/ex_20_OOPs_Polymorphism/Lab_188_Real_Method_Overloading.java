package ex_20_OOPs_Polymorphism;

public class Lab_188_Real_Method_Overloading {
    public static void main(String[] args) {
        Home h1 = new Home();
        h1.task();
        h1.task("Paint Room");
    }
}

class  Home
{
    void task(){
        System.out.println("Task Cleaning Room");
    }

    void task(String Whichtask){
        System.out.println("Which Task ? -> "+ Whichtask);
    }

}
