package ex_30_Collection_framework.CF_04_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_250_realex {
    public static void main(String[] args) {
        Map<String, String> Enconfig= new HashMap<>();
        Enconfig.put("Production","www.studycrm.com");
        Enconfig.put("Testing","www.test1.studycrm.com");

        // Managing the user credentials
        Map<String,String> cred = new HashMap<>();
        cred.put("admin","abc123");
        cred.put("User","abc123");
        cred.put("User1","abc123");
        cred.put("User2","abc123");
// sending data from map to json,json to map - API  Automation heavyly used
        //in selenium - store the webelements  with keys
    }
}
