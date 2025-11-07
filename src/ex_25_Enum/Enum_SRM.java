package ex_25_Enum;

public enum Enum_SRM {

    Dev("http://Develop.srm.com"),
    test("http://testing.srm.com"),
    production("http://prod.srm.com");

    public String getSrm() {
        return Srm;
    }

    private String Srm;
    Enum_SRM(String Srm){
        this.Srm =Srm;
    }

}

