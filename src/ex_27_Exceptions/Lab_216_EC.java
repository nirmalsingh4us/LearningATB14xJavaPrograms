package ex_27_Exceptions;

public class Lab_216_EC {
    public static void main(String[] args) {


        try {
            String ip = args[0];// java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip);//java.lang.NumberFormatException
            int b = 100/a;// if divdied by zero it throws java.lang.ArithmeticException
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}