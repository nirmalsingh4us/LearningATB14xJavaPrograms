package ex_27_Exceptions;

public class Lab_208_Arithmetic {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            b = 10 / a;
        } catch (Exception e) {
            System.out.println("hello guys");
        } catch (Throwable e) {
            System.out.println("This is not allowed");
        }
    }
}