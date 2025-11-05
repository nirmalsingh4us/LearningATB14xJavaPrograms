package ex_23_OOPs_super_abstraction.Superkeyword;

public class Lab_180_superkeyword {
}

class BaseClase{

    BaseClase(){
        System.out.println("Default const-> BaseClass");
    }
    BaseClase(String browser){
        this.browser= browser;
        System.out.println("Dc- Parent");
    }

    private String browser;
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    void openBrowser(){
        System.out.println("Opening Browser !! ");
    }
    void openBrowser(String Browsername){
        System.out.println("Open Browser || "+ Browsername);
    }



void closeBrowser()
{
    System.out.println("Close Browser!!");
}



}

class  Testcase extends BaseClase{

    void testcase(){

    }

    Testcase(){
        super("Chrome");
        super.openBrowser();
        super.closeBrowser();
        super.openBrowser("Firefox");
        System.out.println(super.getBrowser());
        super.setBrowser("Edge");
    }
}