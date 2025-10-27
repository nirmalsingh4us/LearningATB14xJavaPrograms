package ex_16_Arrays;

public class Lab_164_2nd_highest_array {
    public static void main(String[] args) {
        int [] numbers ={22,44,55,22,99,56,74,34};
        int highest =0;
        int secondhigest =0;
     for(int num : numbers)
     {
    if(num>highest){
        secondhigest= highest;
        highest=num;
    }
    else if(num>secondhigest && num!=highest)
    {
        secondhigest= num;
    }
     }

        System.out.println(secondhigest);
        System.out.println(highest);
    }
}
