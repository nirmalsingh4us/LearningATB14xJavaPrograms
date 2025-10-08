package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_145_Sb {
    public static void main(String[] args) {
        StringBuffer stringBuffer= new StringBuffer("Nirmal");
        stringBuffer.append("Singh");
        System.out.println(stringBuffer);

            String s1 ="Nirmal";
            s1 = s1+"Singh";

            System.out.println(s1);
    }
}
