package ex_13_Functions;

import java.util.Scanner;

public class Lab_132_Function_Arth {
    public static void main(String[] args) {
        // Create a funtion of sub, add, mul, div
        // With parameter, a,b ( take parameter from user input)
        // login building
        // step ->  input and outputs
        // a,b -> int -> Scanner
        // Int- > variable  result ->

        // Step 2-  Rough logic -> Create  Function
        // Function ->  type 4th - with  return and with parameter
        // step 3 -  write the code  and find fix   -> Edge cases

        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter the num1");
        int b = readInt(scanner, "Enter the num2");

        int result_Sum = Sum(a,b);
        System.out.println(result_Sum);
        int result_sub = sub(a,b);
        System.out.println(result_sub);
        int result_mul = mul(a,b);
        System.out.println(result_mul);
        int result_div = div(a,b);
        System.out.println(result_div);
        int result_mod = mod(a,b);
        System.out.println(result_mod);
    }

    static int readInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter the only int");
            System.exit(0);
            return -1;
        }
    }

    static int Sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return a / b;
    }

    static int mod(int a, int b) {
        return a % b;
    }
}


