package ex_16_Arrays;

import java.util.Scanner;

public class Lab_165_2d_right_triangle {
    public static void main(String[] args) {
        // Right angle triangle pattern
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the n for the pattern , eg n =3");
//        int n = scanner.nextInt();
            int n =3;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                System.out.print("");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}