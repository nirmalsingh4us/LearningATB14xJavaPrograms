package ex_16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_154_Array_user_input {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of Array(int)");
        int size= scanner.nextInt();

        String [] numbers_marks = new String[size];

        for( int i=0; i< numbers_marks.length; i++){
            System.out.println("Enter the Element ->" +i);
            numbers_marks[i]= scanner.next();


        }
        System.out.println("---- print the value");
        Arrays.sort(numbers_marks);
        for( String marks : numbers_marks){
            System.out.println(marks);
        }


    }
}
