package ex_22_OOPs_access_modifiers.police;


public class Rg extends Cop {
    public Rg(int bullet){
        super(bullet);
    }
    public static void main(String[] args) {
        Cop rg = new Cop(100);
        rg.ThisdefaultF1();
    }
}
