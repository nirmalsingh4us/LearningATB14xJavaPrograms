package ex_16_Arrays;

import java.util.Scanner;

public class Lab_164_2d_reverse_left_triangle {
    public static void main(String[] args) {
        // Right angle triangle pattern
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the n for the pattern , eg n =3");
        int n  = scanner.nextInt();

        for (int i = n; i>=1; i--)
        {
            for(int j=1; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
