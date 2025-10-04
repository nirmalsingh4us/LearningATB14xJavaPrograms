package ex_11_While_loop;

import java.util.Random;
import java.util.Scanner;

public class Lab_122_While_Guss_Number {
    public static void main(String[] args) {
        //Guss the number between 0 to 100
        Random random = new Random();
        int numberToGuss = random.nextInt(100) + 1;
        System.out.println(numberToGuss);

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts=0;

        while(true)
        {
            if(!scanner.hasNextInt())
            {
                System.out.println("Invalid input! Please enter a valid number");
                scanner.next(); // consume invalid value
                continue;
            }
            guess = scanner.nextInt();
            attempts++;

            if (guess<1 || guess>100)
            {
                System.out.println("Please enter a number between 1 to 100");
                continue;
            }
            if (guess< numberToGuss)
            {
                System.out.println("Too Low,Try Again");

            }
            else if (guess> numberToGuss)
            {
                System.out.println("Too high, Try again");

            }
            else {
                System.out.println("Correct ! you guessed it in" + attempts + " attempts ");
                break;
            }
        }
    }
}
