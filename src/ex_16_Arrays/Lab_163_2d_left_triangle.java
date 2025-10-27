package ex_16_Arrays;

import java.util.Scanner;

public class Lab_163_2d_left_triangle {
    public static void main(String[] args) {
        // left hand triangle pattern
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the n for the pattern , eg n =3");
        int n  = scanner.nextInt();

        for (int i = 0; i< n; i++)
        {
            for(int j=0; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
