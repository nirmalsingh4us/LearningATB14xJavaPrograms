package ex_14_Strings;

public class Lab_139_Strings_interview_p2 {
    public static void main(String[] args) {
     String s1= "Hello";
        String s4= "Hello";

        String s2= new String("Hello");
        String s3= new String("Hello");
        String s5= new String("hello");
// Comparison-> String =>  This check  the ref loction
        System.out.println(s1 ==s2 );
        System.out.println(s1== s3);
        System.out.println(s1== s4);
        System.out.println(s3== s5);
// equal (Content) -> value
        System.out.println(s1.equals(s4) );
        System.out.println(s2.equals(s3) );
        System.out.println(s1.equals(s5) );
        System.out.println(s3.equals(s5) );
    }
}
