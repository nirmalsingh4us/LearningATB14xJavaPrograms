package ex_18_OOPs_Constructors;

public class car {
    String name ;
    int year ;
    String model;

    //Default constructor

    car()
    {
        name = "Suzuki";
        year = 2017;
        model ="Alto k10 ";

        System.out.println("This is my first new car "+ name +" " + year +" "+ model );
    }
}
