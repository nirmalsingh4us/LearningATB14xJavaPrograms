package ex_20_OOPs_Polymorphism;

public class Calculator {
    public static void main(String[] args) {

        calc c1= new calc();
        c1.add(5,7);
        c1.add(3.4,4.5);
    }
}

class  calc{
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }

    long add(long a, long b){
        return a+b;
    }


}