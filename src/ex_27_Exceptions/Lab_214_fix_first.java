package ex_27_Exceptions;

public class Lab_214_fix_first {
    public static void main(String[] args) {


        try {
            String ip = args[0];// java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip);//java.lang.NumberFormatException
            int b = 100/a;// if divdied by zero it throws java.lang.ArithmeticException
            System.out.println(b);
        } catch (NumberFormatException |ArithmeticException|ArrayIndexOutOfBoundsException e ) {
            System.out.println("Problem");
        }
        finally {
            System.out.println("I will be always executed !!");
        }

    }
}

