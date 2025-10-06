package ex_13_Functions;

public class Lab_130_UD_Part1 {
    public static void main(String[] args) {
        // 1. without parameter and without return type
        // 2. without parameter and with return type
        // 3. with parameter and without return type
        // 4. with parameter and with return type
        wop_wor_greet();

        String Greet = Wop_Wr_greet_2();
        System.out.println(Greet);
        greet_with_details("Nirmal Singh",39,35000);
        int res =sum_of_two_number(5,7);
        System.out.println(res);
        int res2=sum_of_three_number(12,25,85);
        System.out.println(res2);
        float res3 = sum_of_three_number_fl(4.3F,4.6F,4.7F);
        System.out.print(res3);
    }

    // 1. without parameter and without return type
    static void wop_wor_greet(){
        System.out.println("Hi Very good morning!");
        System.out.println("Hi This is function1");
    }
    // 2. without parameter and with return type
    static String Wop_Wr_greet_2(){
        System.out.println("Very good Afternoon!!");
        return "Hi, How are you ";
    }
    // 3. with parameter and without return type

    static void greet_with_details(String name, int age,double salary){
        System.out.println("Your Name ->"+name+"\nYour age is ->"+age+"\nYour Salary is ->"+salary);

    }
    // 4. with parameter and with return type
    static  int sum_of_two_number(int a, int b){
        return a+b;
    }
    static  int sum_of_three_number(int a, int b, int c){
        return a+b+c;
    }
    static  float sum_of_three_number_fl(float a, float b,float c){
        return a+b+c;
    }
}
