package ex_23_OOPs_super_abstraction.Abstraction;

public class Lab_189_multiple_inheritance_solved {
}

class  child1 implements Father1,Father2{
    @Override
    public void money() {
        System.out.println("Son money!");
    }
}
interface Father1{
    void money();
}


interface Father2{
    void money();
}

