package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab_149_Programs {
    public static void main(String[] args) {
        // Write a program  to reverse a string without using in built functions

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input String, I will reverse it ");
        String user_input= sc.next();
       // StringBuilder sb = new StringBuilder(user_input);
        //System.out.println(sb.reverse());
    // Nirmal ->    user_input.length(), charat()
        String user_input_reverse ="";

        for ( int i= user_input.length()-1;i >=0; i--)
        {
            user_input_reverse= user_input_reverse + user_input.charAt(i);

        }

        System.out.println(user_input_reverse);

    }
}
