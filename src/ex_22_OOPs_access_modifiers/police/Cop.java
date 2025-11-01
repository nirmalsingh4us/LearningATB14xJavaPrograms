package ex_22_OOPs_access_modifiers.police;

public class Cop {
public int gun;
private String icard;


public  Cop(int bullet) // constructor
{
    this.gun= bullet;
}

protected void ConIshot() // method or behaviour
{
    System.out.println("Yes you can shot!");
}
 void ThisdefaultF1()
 {
     System.out.println("Hi Cop!");
 }
}

