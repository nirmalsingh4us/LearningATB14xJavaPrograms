package ex_27_Exceptions;

import java.util.Scanner;

public class Lab_222_throwexample {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter you age");
        int user_age = scanner.nextInt();
        validate_age_for_club(user_age);
    }
static void validate_age_for_club(int age) throws Exception {
        if (age<25){

            throw new Exception("Age can't be less then 25");
        }
        else {
            System.out.println("Enjoy the Club");
        }
}
}
