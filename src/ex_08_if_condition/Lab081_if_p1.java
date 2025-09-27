package ex_08_if_condition;

public class Lab081_if_p1 {
    public static void main(String[] args){
        int age = Integer.parseInt(args[0]);
        if(age > 18)
        {
            System.out.println("Yes You can go to goa");

        }
        else{
            System.out.println("You cannot go to Goa");
        }
    }
}
