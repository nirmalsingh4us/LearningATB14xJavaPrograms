package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_143_String_Functions {
    public static void main(String[] args) {
        String name  = "Nirmal";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
       // System.out.println(name.charAt(10));
        System.out.println(name.concat("Singh"));
        System.out.println(name.contains("ir"));
        System.out.println(name.equals("Nirmal"));
        System.out.println(name.equalsIgnoreCase("Nirmal"));
        System.out.println(name.indexOf("i"));
        String s1 ="Mehtab";
        System.out.println(s1.indexOf("M"));


        StringBuilder stringBuilder = new StringBuilder("Nirmal");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}

