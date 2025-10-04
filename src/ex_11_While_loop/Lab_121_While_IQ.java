package ex_11_While_loop;

import java.util.Scanner;

public class Lab_121_While_IQ {
    public static void main(String[] args) {
        //factorial program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number For Factorial Program !");
        if(!scanner.hasNextInt())
        {
            System.out.println("You fool, Only Int");

        }
        else {
            int number = scanner.nextInt();
            int fact = 1;
            if (number== 0){
                fact = 1;
                System.out.println("fact = 1");
            }
            if (number<0 || number> Integer.MAX_VALUE)
            {
                System.out.println("Can't get the Factorial as out of bound ! (int)");
            }
            int i= 1;
            while(i<= number)
            {
                fact= fact*i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
