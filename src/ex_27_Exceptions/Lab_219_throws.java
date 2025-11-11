package ex_27_Exceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_219_throws {
    public static void main(String[] args) throws FileNotFoundException
    {
        FileReader f = new FileReader( new File("E://nirmal.txt"));


    }
}
