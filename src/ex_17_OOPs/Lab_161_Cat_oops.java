package ex_17_OOPs;

public class Lab_161_Cat_oops {
    public static void main(String[] args) {
        cat c1 = new cat();
        cat c23 = new cat("tomcat");
        cat c24 = new cat("Bobcat");
        cat c2 = new cat("Lucy");
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c23.name);
        System.out.println(c24.name);
        c23.running();
        c24.running();
    }
}

class cat{

    String name ;
    cat (){
        name ="Kitty";
    }

    cat (String paraname){
        this.name = paraname;
    }
    void running (){
        System.out.println("Who is running-> "+ this.name);
    }
}
