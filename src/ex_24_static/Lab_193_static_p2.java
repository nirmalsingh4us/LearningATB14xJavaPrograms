package ex_24_static;

public class Lab_193_static_p2 {
}

class ATB{

    int phone_no;
    String name;

    static  String course_name = "ATB";

    static void markattandence(){
        System.out.println("Mark Attandence!");

    }
void display(){
    System.out.println(this.phone_no + this.name + course_name );
}
}

