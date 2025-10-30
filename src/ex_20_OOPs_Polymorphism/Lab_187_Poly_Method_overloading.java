package ex_20_OOPs_Polymorphism;

public class Lab_187_Poly_Method_overloading {
    public static void main(String[] args)
    {
        MathOperation m1 = new MathOperation();
        int r1=  m1.add(5,6);
        double r2= m1.add(3.4,4.6);
        int r3 = m1.add(4,5,7);
        String r4 = m1.add("Nirmal", "Singh");

    }
}

class MathOperation{
// in the same class, when you have a method with same methods
    //but differnt arguments and differnt return type
    int add( int a, int b){
        return a+b;
    }
    int add( int a, int b, int c){
        return a+b+c;
    }
    double add( double a, double b){
        return a+b;
    }
    String  add( String a, String b){
        return a+b;
    }
}
