package ex_16_Arrays;

public class Lab_155_Array_reverse {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};

        for( int i = numbers.length-1; i>=0; i--)
        {
            System.out.print(numbers[i]);
        }
    }
}
