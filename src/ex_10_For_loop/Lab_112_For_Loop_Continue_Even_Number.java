package ex_10_For_loop;

public class Lab_112_For_Loop_Continue_Even_Number {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
           // System.out.println(i);
            if(i %2 != 0) {
               continue;
            }
            System.out.println(i);
        }
    }
}
