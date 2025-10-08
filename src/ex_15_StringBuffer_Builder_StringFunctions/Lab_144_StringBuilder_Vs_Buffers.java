package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_144_StringBuilder_Vs_Buffers {
    public static void main(String[] args) {
        // String use 90%
        String s0 = "Nirmal";
        String s1= new String ("Nirmal");
    // String builder and buffer 10 %
        StringBuilder stringBuilder = new StringBuilder("Nirmal");
        StringBuffer stringBuffer= new StringBuffer("Nirmal");
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
        }

}
