package ex_24_static;

public class Lab_192_static {
    public static void main(String[] args) {
        Student s1 = new Student(39);
        Student s2 = new Student(40);

        System.out.println(s1.age);
        System.out.println(s2.age);

        System.out.println(Student.course_name);
        System.out.println(s1.course_name);
        System.out.println(s2.course_name);
        //Student.m1();
    }
}
class Student{

    int age ;// non static or instance variable,Attribute
    static  String course_name= "AtB";

    public Student(int age_C){
        this.age= age_C;
    }

    static void m1(){
        System.out.println("I am a static method");
    }

}