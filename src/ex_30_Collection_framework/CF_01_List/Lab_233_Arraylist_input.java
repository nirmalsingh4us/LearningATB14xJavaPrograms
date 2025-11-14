package ex_30_Collection_framework.CF_01_List;

import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Lab_233_Arraylist_input {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter your list");
//        scanner.next();

        String continueinput = "Y";
        List<String> names = new ArrayList<>();
        while (continueinput.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();

            System.out.println("Do you want to continue to add other name, Press Y/N ");
            continueinput = scanner.nextLine();

        }

        for(Object o:names)
        {
            System.out.println(o);
        }
     scanner.close();
    }
}
