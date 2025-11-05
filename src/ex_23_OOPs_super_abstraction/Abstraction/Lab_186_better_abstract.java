package ex_23_OOPs_super_abstraction.Abstraction;

public class Lab_186_better_abstract {
    public static void main(String[] args) {
        Altok10 a = new Altok10();
      a.drive();
    }
}
abstract class car1{
    abstract void startcar();
    abstract void stopcar();

}

class Altok10 extends car1 implements Tyre,Gear,Engine{

    void drive(){
       this.carengine();
        this.startcar();
        this.stopcar();
        this.changegear();
        this.rubbertyre();
        this.blackcolortotyre();
    }

    @Override
    void startcar() {
        System.out.println("Start the Altok10 car");
    }

    @Override
    void stopcar() {
        System.out.println("Stop the Altok10 car");
    }

    @Override
    public void changegear() {
        System.out.println("Change the gear");
    }

    @Override
    public void rubbertyre() {
        System.out.println("Car have rubber tyres");

    }

    @Override
    public void blackcolortotyre() {
        System.out.println("Change the black color tyre");
    }

    @Override
    public void carengine() {
        System.out.println("Start the car engine before the put key on");
    }
}

interface Tyre{
    abstract void rubbertyre();
    void blackcolortotyre();

}

interface Gear{
    void changegear();
}

interface Engine{
    void carengine();
}