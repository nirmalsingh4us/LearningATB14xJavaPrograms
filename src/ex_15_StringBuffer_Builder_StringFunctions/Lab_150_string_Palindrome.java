package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_150_string_Palindrome {
    public static void main(String[] args) {
        String input=  "RAMAR";
        String reverse = "";
        for (int i = input.length()-1;i>=0; i--)
        {
            reverse = reverse+input.charAt(i);
        }

        if (reverse.equalsIgnoreCase(input))
        {
            System.out.println("Palindrome");

        }
        else
        {
         System.out.println("it is not palindrome");
        }


    }
}
