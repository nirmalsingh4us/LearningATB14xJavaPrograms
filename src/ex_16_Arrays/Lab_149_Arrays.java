package ex_16_Arrays;

import java.awt.*;

public class Lab_149_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int [] marks ={90,91,90,85,89,55,60};
        boolean [] is_married_people ={true, false, true};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[5]);

        String name ="Nirmal";
        String[] name_each_element= name.split("");
        for(String s : name_each_element)
        {
            System.out.print(s);
        }
    }
}
