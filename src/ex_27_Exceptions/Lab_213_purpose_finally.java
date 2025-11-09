package ex_27_Exceptions;

import java.util.Scanner;

public class Lab_213_purpose_finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int a = 10/v;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        sc.close();
        }

    }
}
