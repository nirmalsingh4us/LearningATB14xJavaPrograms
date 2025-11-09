package ex_27_Exceptions;

public class Lab_204_exception {
    public static void main(String[] args) {
        System.out.println("Start the program");

        String ip = args[0];// java.lang.ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip);//java.lang.NumberFormatException
        int b = 100/a;// if divdied by zero it throws java.lang.ArithmeticException
        System.out.println(b);
        System.out.println("End of the program");
    }
}
