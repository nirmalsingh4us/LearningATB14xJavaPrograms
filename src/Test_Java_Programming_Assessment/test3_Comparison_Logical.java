package Test_Java_Programming_Assessment;

public class test3_Comparison_Logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("a == b " + (a == b));
        System.out.println("a != b " + (a != b));
        System.out.println("a > b " + (a > b));
        System.out.println("a < b " + (a < b));
        System.out.println("a >= b " + (a >= b));
        System.out.println("a <= b " + (a <= b));

        // Logical Operators
        System.out.println("(a > b) && (a > 0) " + ((a > b) && (a > 0)));
        System.out.println("(a < b) || (a > 0) " + ((a < b) || (a > 0)));
        System.out.println("!(a > b) " + (!(a > b)));
}
}
