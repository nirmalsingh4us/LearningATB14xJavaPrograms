package ex_10_For_loop;

public class Lab_111_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
           // System.out.println(i);
            if(i ==5) {
               continue;
            }
            System.out.println(i);
        }
    }
}
