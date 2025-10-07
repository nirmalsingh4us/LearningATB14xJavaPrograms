package ex_14_Strings;

public class Lab_143_String_exampls3 {
    public static void main(String[] args) {
         String s ="Java";
         char c= s.charAt(2);
         System.out.println(c);

    int result = "abc".compareTo("ABC");
    System.out.println(result);


        int idx = "nirmal".indexOf("r");
        System.out.println(idx);

        int idx2 = "nirmal".lastIndexOf("i");
        System.out.println(idx2);

        boolean b = "".isEmpty();
        System.out.println(b);

        String s11 = String.join("*","Singh","Nirmal");
        System.out.println(s11);

        String s12 = "Nirmal".replace("i","o");
        System.out.println(s12);

        boolean b1 = "Nirmal".startsWith("Ni");
        System.out.println(b1);
        String b2 = "Nirmal".concat(" Singh");
        System.out.println(b2);
    }
}
