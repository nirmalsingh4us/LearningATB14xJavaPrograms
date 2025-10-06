package ex_13_Functions;

public class Lab_128_Simple_method {
    public static void main(String[] args) {
non_return_type_function();
String name = return_String_type_function();
System.out.println(name);

    }
    //step 1 -Functions
    // Declaration , defination

    static void non_return_type_function() {
        // this is the block of code to be executed
        System.out.println("Hi , There is non return function");
        return_boolean();
        return_float_pi_value();
        return_byte();
        return_long();

    }

    static String return_String_type_function() {
        // this is the block of code to be executed
        System.out.println("Hi , There is a return type function");
        return "Nirmal Singh";

    }
    static  boolean  return_boolean(){
        return true;
    }
    static float return_float_pi_value(){
        return 3.14f;
    }
    static byte return_byte(){
        return 100;
    }
    static long return_long(){
        return 100l;
    }
}