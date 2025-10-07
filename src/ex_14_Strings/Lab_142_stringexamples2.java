package ex_14_Strings;

public class Lab_142_stringexamples2 {
    public static void main(String[] args) {
        String  s = "Nirmal".substring(2);
        System.out.println(s);

        String  s1 = "Nirmal".substring(1,3);
        System.out.println(s1);

        char[] arr = "Nirmal".toCharArray();
        System.out.println(arr);

        String st= " Nirmal ".trim();
        System.out.println(st);

        boolean  b = "  ".isBlank();
        System.out.println(b);

        String s2 = "ab".repeat(3);
        System.out.println(s2);

        boolean b11= "Java".equalsIgnoreCase("java");
        System.out.println(b11);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);
    }
}
