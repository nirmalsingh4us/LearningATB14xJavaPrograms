package ex_27_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_218_interview_p2 {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader(new File("C://Log.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
