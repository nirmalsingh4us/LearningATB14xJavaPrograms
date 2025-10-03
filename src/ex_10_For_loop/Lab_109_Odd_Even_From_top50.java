package ex_10_For_loop;

public class Lab_109_Odd_Even_From_top50 {
    public static void main(String[] args) {

        //find the Even number from 1 to 50
        for (int i = 1; i <= 50; i++) {// 0 to 10, 11 times
            if(i %2 == 0)
            {
                System.out.println("Even ->"+i);
            }

        }

    }
}