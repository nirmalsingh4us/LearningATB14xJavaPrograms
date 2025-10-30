package ex_19_OOPs_Inheritance.Singleinheritance.multilevel_inheritance;

public class Lab_170_Multilevel {
    public static void main(String[] args) {
        Son Nirmal = new Son();
        Nirmal.home();
        Nirmal.gf();
        Nirmal.extra();
        Nirmal.bhk3();


        Father F = new Father();
        F.extra();
        F.home();
        F.gf();

        Grandfather GFF= new Grandfather();
        GFF.home();
        GFF.gf();


        //Dynamic Dispatch
        Grandfather g1= new Son(); //this is example of Dynamic dispatch
        Father F1 = new Son();
        //Son S1 = Grandfather; This is not possible


    }
}
