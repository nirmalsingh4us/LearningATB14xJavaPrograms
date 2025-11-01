package ex_23_OOPs_abstraction.Superkeyword;

public class Lab_181_super {
}

class Father{
    Father(){
        System.out.println("DC- Father");
            }

    int gold= 10;
 void home (){
     System.out.println("Father home");
 }
}

class Son extends Father{
    Son()
    {
            super();
    }
    int gold_Son= 100;
    void bike(){}
    void newhome (){
        System.out.println(super.gold);
        super.home();
        this.bike();
        System.out.println(this.gold_Son);
    }
}