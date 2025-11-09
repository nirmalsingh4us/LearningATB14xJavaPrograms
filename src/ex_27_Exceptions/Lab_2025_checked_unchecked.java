package ex_27_Exceptions;

public class Lab_2025_checked_unchecked {
    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        //int c = b/a;// java.lang.ArithmeticException
        //System.out.println(c);

        String name =null; // java.lang.NullPointerException
        name.trim();
    // these are examples of unchecked exceptions

    }
}
