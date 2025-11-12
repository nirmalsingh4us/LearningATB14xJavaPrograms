package ex_27_Exceptions;

public class Lab_223_Finally_not_Executed {
    public static void main(String[] args) {
        try {
            int a = 10/10;
            System.out.println("Try executed");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Catching the errors");
        } finally {
            System.out.println("I will be executed");
        }

    }
}
