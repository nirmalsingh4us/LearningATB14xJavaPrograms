package ex_19_OOPs_Inheritance.Singleinheritance;

public class Lab_168_SInheritance {
    public static void main(String[] args) {
        Son nirmal = new Son();
        nirmal.bhk3();
        nirmal.bhk2();
        System.out.println(nirmal.gold_F);

        Father f1= new Father();
        f1.bhk2();
        System.out.println(f1.gold_F);
        //f1.bhk3();
    }
}
