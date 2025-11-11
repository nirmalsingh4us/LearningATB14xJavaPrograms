package ex_27_Exceptions;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_220_throws {
    public static void main(String[] args)
    {
        try {
            FileInputStream f = new FileInputStream( new File("E://nirmal.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("yes");
        }


    }
}
