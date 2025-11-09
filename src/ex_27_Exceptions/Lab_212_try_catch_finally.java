package ex_27_Exceptions;

public class Lab_212_try_catch_finally {
    public static void main(String[] args) {
        int a= 0;
        int c= 0;
        try {
            c =10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be executed always");
        }
        System.out.println(c);

    }
}