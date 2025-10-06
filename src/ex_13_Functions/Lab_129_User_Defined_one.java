package ex_13_Functions;

import java.util.Scanner;

public class Lab_129_User_Defined_one {
    public static void main(String[] args) {
   // int result = sum_of_two_numbers();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the value a");
        int a = scanner.nextInt();
        System.out.println("Enter the value b");
        int b = scanner.nextInt();
    // int result = sum_of_two_numbers(5,7);
    //int result2 = sum_of_two_numbers(8,0);
    int result3 = sum_of_two_numbers(a,b);
       // System.out.println(result);
       // System.out.println(result2);
        System.out.println(result3);
    }
    static int sum_of_two_numbers(int a,int b){
        return a+b;
    }
}
