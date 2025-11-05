package ex_23_OOPs_super_abstraction.Abstraction;

public class Lab_182 {
    public static void main(String[] args) {
        Car tesla = new Car(300);
        tesla.drive();

    }

}
























class Vehicle   {
    public  int maxSpeed =180;
    void noTest(){
        System.out.println("Empty");

    }
    Vehicle(){
        System.out.println("Default Constructor");
    }
Vehicle(int a){
    System.out.println("{Parameter Const.");
}
Vehicle(int a, int b)
{
    System.out.println("Paramerter Const.");
}

// Method Overloading - Same, Same name funtion with differnt argument

    void Message(){
    System.out.println("No Return, No argument");

}

    void Message(int a){
    System.out.println("PC- Argument");
}
 void drive(){
     System.out.println("Vehicle parent");
 }
}

class Car extends Vehicle{
    private  int maxSpeed = 281;

    Car(){
        super(300);
    }
    Car(int a){
        System.out.println("PC Car");
    }

void test(){}
   @Override
    void drive(){
        System.out.println("Over ridden the vehicle!!");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.noTest();

    }
}
