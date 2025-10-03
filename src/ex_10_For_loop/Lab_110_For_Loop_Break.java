package ex_10_For_loop;

public class Lab_110_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
           // System.out.println(i);
            if(i ==5) {
               break;
            }
            System.out.println(i);
        }
    }
}
