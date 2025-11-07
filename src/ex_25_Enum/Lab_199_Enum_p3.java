package ex_25_Enum;

public class Lab_199_Enum_p3 {
    public static void main(String[] args) {
        System.out.println(HEX_Color.Red.getHexCode());

    }
}

enum HEX_Color{
    Black("#000000") ,
    White("#FFFFFF"),
    Gray("#808080"),
    Silver("#C0C0C0"),
    Red	("#FF0000");



    private String HexCode;

    HEX_Color(String Hexcode){
        this.HexCode= Hexcode;
    }
    public String getHexCode() {
        return HexCode;
    }
}