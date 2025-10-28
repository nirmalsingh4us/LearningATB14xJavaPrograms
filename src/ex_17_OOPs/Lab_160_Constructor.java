package ex_17_OOPs;

public class Lab_160_Constructor {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Nirmal");

    }
}

class  Student {
    String name ;
// Default constuctor called
    Student(){
    System.out.println("DC ->Hi , I am called constructor");
}
// Parameter consturctor
    Student(String name)
    {
        System.out.println("PC->Hi I am "+ name);
    }
    void sleep(){}
    void eat(){}
    void study(){}
        }

