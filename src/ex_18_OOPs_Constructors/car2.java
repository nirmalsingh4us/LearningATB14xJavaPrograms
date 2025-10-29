package ex_18_OOPs_Constructors;

public class car2 {
    String model;
    int year;

    car2()
    {
        model ="Mahindra";
        year = 2017;
        System.out.println("Mahindra Thar");
    }


    // constructor overloading
    // We can call constructor each other with "this " or called constructor chaining
    car2(String model_name,int year_created) {
        this("XUV700");
        this.model = model_name;
        this.year = year_created;

    }

    car2 (String model_name)
    {
        this.model= model_name;
    }

}
