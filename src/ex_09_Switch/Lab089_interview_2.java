package ex_09_Switch;

public class Lab089_interview_2 {
    public static void main(String[] args) {
        char ch= 'A';
        switch (ch){
            case 63:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("Not matched");
                break;
        }
    }
}
