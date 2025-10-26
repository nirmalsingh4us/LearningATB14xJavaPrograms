package ex_16_Arrays;

public class Lab_156_Sum_of_arrays {
    public static void main(String[] args) {
        int [] number = {22,44,55};

        int sum =0;
    for (int i = 0; i< number.length; i++)
    {
        sum = sum + number[i];
    }
        System.out.println(sum);
    }
}
