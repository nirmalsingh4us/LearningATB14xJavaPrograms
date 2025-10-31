package ex_21_OOPs_Encapsulation;

public class Lab_190_realex {
    public static void main(String[] args) {

        ICICIBank bk = new ICICIBank("Nirmal",100);
        long bal = bk.getBal();
        //System.out.println(bk.bal) private in nature
        System.out.println(bal);

        ICICIBank Cashier = new ICICIBank("cash",1);
        Cashier.setBal(300,true);
        System.out.println(Cashier.getBal());
    }
}

class ICICIBank{

    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean Iscashier) {
        if (Iscashier) {
            this.bal = bal;
        }
        else {
            System.out.println("not Allowed !!");
        }
    }
}
