package ex_16_Arrays;

import java.util.Arrays;

public class Lab_157_iq_2nd_highest_number {
    public static void main(String[] args) {
        int[] numbers = {12,34,10,1,100,3,4,32,99};
        Arrays.sort (numbers);
        System.out.println(numbers[numbers.length-2]);
    }
}
