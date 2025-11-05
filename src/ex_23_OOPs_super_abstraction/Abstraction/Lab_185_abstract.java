package ex_23_OOPs_super_abstraction.Abstraction;

public class Lab_185_abstract {
    public static void main(String[] args) {
        son s1 = new son();
        s1.loan50k();
        s1.loan10k();
    }
}

abstract class amit_father{

    abstract void loan50k();
    void loan10k(){
        System.out.println("Given");
    }

    }
class son extends amit_father{
    @Override
    void loan50k() {
        System.out.println("Ok i will pay the father loan");
    }
}