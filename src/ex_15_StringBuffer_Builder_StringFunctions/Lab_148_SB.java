package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_148_SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        sb.append("programming");
        sb.replace(0,4," c++ ");
        System.out.println(sb);

    }
}
