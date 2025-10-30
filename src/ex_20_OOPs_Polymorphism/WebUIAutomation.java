package ex_20_OOPs_Polymorphism;

public class WebUIAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.startbrowser();
        b1.startbrowser("Chorme");
        b1.startbrowser("Firefox");
    }

}
class Browser{
    void startbrowser(){
        System.out.println("Default Browser is started !");
    }
    void startbrowser(String Browsername)
    {
        System.out.println("Starting Browser "+ Browsername);
    }
}
