package ex_27_Exceptions;

public class Lab_finalize {
    public static void main(String[] args) {
        Lab_finalize lb = new Lab_finalize();
        lb= null;
        System.gc();
        System.out.println("Main method called");

    }
@Override
    public void finalize(){
        System.out.println("Hi, Called");
    }
}
