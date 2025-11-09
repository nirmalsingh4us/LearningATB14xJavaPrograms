package ex_27_Exceptions;

public class Lab_207_try_catch {
    public static void main(String[] args) {
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println("Error, Trim is not allowed with null values");
        }
        //unchecked null pointer

    }
}
