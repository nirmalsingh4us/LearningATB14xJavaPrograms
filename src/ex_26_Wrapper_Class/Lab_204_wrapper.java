package ex_26_Wrapper_Class;

import java.awt.print.PrinterGraphics;

public class Lab_204_wrapper {
    public static void main(String[] args) {
        int a= 10;
        Integer aa= a;
//Boxing- prmitive - wrapper- autoboxing - JVM will do it
        System.out.println(aa.intValue());
        System.out.println(aa);

        //unboxing
        Integer b =43;
        int a1 = b;// unboxing
        System.out.println(a1);
    }
}
