package ex_23_OOPs_super_abstraction.Abstraction;

public class Lab_190_interview_question {
}

interface I11{

}

interface I12{}
class A1{}
class A2{}

//class test1 extends A1,A2{} not possible

class test3 implements I11{}
class test4 implements I11,I12{}
class test5 extends A1 implements I12,I11{}
//class test5 implements I12 extends A1 not allowed

//interface I13 extends A1{} not possible
