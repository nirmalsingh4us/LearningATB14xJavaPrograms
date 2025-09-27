package ex_09_Switch;

public class Lab094_JDK13above {
    public static void main(String[] args) {
        int itemcode = 002;
        switch (itemcode){
            case 001,002,003:
                    System.out.println("This is old market");
                    break;
            case 004,005:
                    System.out.println("This is new market");
                    break;

            default:
                System.out.println("none");
            break;
        }

    }
}

