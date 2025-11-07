package ex_25_Enum;

public class Lab_200_Enum_real_webautomation {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocator());
    }
}
enum Locators{
 page_input_email ("//*[@id=\"login-username\"]"),
   Page_input_password ("//*[@id=\"login-password\"]"),
    getPage_input_button("button");


    public String getLocator() {
        return locator;
    }

    private String locator;
    Locators(String locator){
        this.locator= locator;


    }
}