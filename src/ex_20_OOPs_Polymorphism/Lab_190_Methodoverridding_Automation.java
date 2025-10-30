package ex_20_OOPs_Polymorphism;

public class Lab_190_Methodoverridding_Automation {
    public static void main(String[] args) {
        ChromeTC ctc = new ChromeTC();
        ctc.OpenBrowser();

//        ChromeTC ct2 = new Firefoxtc();
//        ct2.OpenBrowser();

        Firefoxtc fx= new Firefoxtc();
        fx.OpenBrowser();

        CommonToall ca = new CommonToall();
        ca.OpenBrowser();

        CommonToall ca1= new ChromeTC();
        ca1.OpenBrowser();

        CommonToall ca2 = new Firefoxtc();
        ca2.OpenBrowser();
    }
}

class CommonToall
{
    void OpenBrowser(){
        System.out.println("Starting the IE Browser.");

    }
}
class ChromeTC extends CommonToall
{
    @Override
    void OpenBrowser()
    {
        System.out.println("Starting chorme, Better Browser!!");
    }
}

class Firefoxtc extends CommonToall
{
    @Override
    void OpenBrowser()
    {
        System.out.println("Starting Firefox, Better Browser!!");
    }
}