package ex_16_Arrays;

import java.util.Arrays;

public class Lab_153_array_max_min {
    public static void main(String[] args) {
        int [] array = {33,44,55,66,88,99,33};
//        Arrays.sort(array);
//        System.out.println(array[array.length-1]);
//         int max = array[0];
//         for(int i = 0; i<array.length; i++)
//         {
//             if(array[i]>max)
//             {
//                 max= array[i];
//             }
//
//         }
//        System.out.println(max);

        int min = array[0];
        for(int i = 0; i<array.length; i++)
        {
            if(array[i]<min)
            {
                min= array[i];
            }

        }
        System.out.println(min);
    }
}
