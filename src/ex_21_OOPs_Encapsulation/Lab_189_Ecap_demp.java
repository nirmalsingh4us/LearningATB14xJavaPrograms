package ex_21_OOPs_Encapsulation;

public class Lab_189_Ecap_demp {

    public static void main(String[] args) {

        vwologin vlog = new vwologin("admin","abc@123");
        System.out.println(vlog.password);
        vlog.password="nirmal2123";
        System.out.println(vlog.password);

        Goodvwologin glog = new Goodvwologin("Nirmal_user","nir@123");
        //glog.pwd ="asr@123";
        glog.setPwd("adr@123",true);


    }
}


class vwologin
{
    public String username ;
    public String password;

     vwologin(String username,String password)

    {
        this.username = username;
        this.password = password;
    }

}

class Goodvwologin{
    private String uname;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd,boolean isgoodadmin ) {
        if(isgoodadmin){
        this.pwd = pwd;}
        else {
            System.out.println("Not Allowed!!");
        }
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    private String pwd;


    Goodvwologin(String username, String password){
        this.uname= username;
        this.pwd= password;
    }
}