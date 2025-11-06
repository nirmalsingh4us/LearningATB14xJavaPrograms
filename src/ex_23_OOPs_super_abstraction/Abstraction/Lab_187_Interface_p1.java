package ex_23_OOPs_super_abstraction.Abstraction;

public class Lab_187_Interface_p1 {
    public static void main(String[] args) {
        car2 c2 = new car2();
        c2.drive();
    }
}

class car2 implements breaks,Engine1{

    void drive(){
        startengine();
        applybreaks();
        stopengine();
    }

    @Override
    public void startengine() {
        System.out.println("First start the engine");

    }

    @Override
    public void stopengine() {
        System.out.println("Please stop the engine after the testing");

    }

    @Override
    public void applybreaks() {
        System.out.println("Please check the breaks");

    }
}

interface breaks{
    void applybreaks();
}

interface Engine1{
    void startengine();
    void stopengine();
    default  void testingengine() {
        System.out.println("Concrete Complete");
    }
    default  void testingengine1() {
        System.out.println("Concrete Complete1");
    }
}