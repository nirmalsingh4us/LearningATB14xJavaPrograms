package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_automation {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        switch (browser){
            case "Edge":
                System.out.println("Starting the testing in edge");
                System.out.println("........");
                System.out.println("........");
                System.out.println("completed");
                break;

            case "Chrome":
                System.out.println("Starting the testing in Chrome");
                System.out.println("........");
                System.out.println("........");
                System.out.println("completed");
                break;

            case "Firefox":
                System.out.println("Starting the testing in Firefox");
                System.out.println("........");
                System.out.println("........");
                System.out.println("completed");
                break;
            default:
                System.out.println("Please enter the correct name");
        }
    }
}
