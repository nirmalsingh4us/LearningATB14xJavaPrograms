package ex_30_Collection_framework.CF_01_List;

import java.util.ArrayList;
import java.util.List;

public class Lab_239_Arraylist_Classelement {

    public static void main(String[] args) {
        student s1 = new student("nirmal", "17");
        student s2 = new student("Gurbir", "18");
        student s3 = new student("Gagan", "19");

        List<student> mystudent = new ArrayList<>();
        mystudent.add(s1);
        mystudent.add(s2);
        mystudent.add(s3);

       s1.printdeails();
        s2.printdeails();
        s3.printdeails();
    }
}

class student extends Object{
    private String name ;
    private String rollno;

    public student(String name,String rollno){
        this.name= name;
        this.rollno= rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return super.toString();
    }
     public  void printdeails(){
            System.out.println("Student name :" + this.name );
            System.out.println("Student rollno :" + this.rollno);
        }
    }
