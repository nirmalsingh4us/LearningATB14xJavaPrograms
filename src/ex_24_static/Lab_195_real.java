package ex_24_static;

public class Lab_195_real {
}
class ATB14x{
    {
        System.out.println("IIB ->This is called when object is created");
        // what is the purpose?
        //Here you can write code related to
        // start a website or anything before starting the
        // Web automation or api automation
    }

    static {
        System.out.println("Load the class , i will execute");
    }

    private String name; // these are non static or instance variables
    private String phone;
    static  String course_name = "ATB14x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    void readDocument(){
        System.out.println("Non Static Method");
        System.out.println(course_name);
    }
static void doAssignment() {
    //System.out.println(phone); Static method can't access the non static variable
    System.out.println("Do Assignment");

}
}