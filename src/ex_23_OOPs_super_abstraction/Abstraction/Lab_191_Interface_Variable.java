package ex_23_OOPs_super_abstraction.Abstraction;

public class Lab_191_Interface_Variable {
    public static void main(String[] args) {

    }
}

interface  Nirmal{
    int a= 10;
    void display();
}

class  singh implements Nirmal{
    int aa = 10;

    @Override
    public void display() {
        System.out.println(a);
        System.out.println(this.aa);
    }
}