
package ex_27_Exceptions;

import java.util.Scanner;

public class Lab_Throw_exp {
    public static void main(String[] args) throws Custom_Exception {
        Scanner scanner = new Scanner(System.in);
        if(!scanner.next().equalsIgnoreCase("Nirmal"));{
            throw new Custom_Exception("Get away");
        }
    }
}
