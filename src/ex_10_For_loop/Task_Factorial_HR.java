package ex_10_For_loop;

import java.util.Scanner;
import java.util.SequencedSet;

public class Task_Factorial_HR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int nirmal = 1;
        if (n == 0)
    {
        nirmal =1;
    }
        //for (int i = 1 ; i <= n; i++)
            for (int i =n ; i>= 1; i--)

        {

            nirmal = nirmal * i;
        }
    System.out.println(nirmal);
    }
}
