package ex_18_OOPs_Constructors;

public class Lab_162_p2 {
    public static void main(String[] args) {

    Baby b1 = new Baby();
    System.out.println(b1.name);
     b1.baby_bahivour();

    }
}
class Baby{

    String name;

    //Default constructor
    Baby()
    {
        name ="Raman";
    }
 void baby_bahivour ()
{
    System.out.println("MY Baby is so sweet "+ name);
}
}