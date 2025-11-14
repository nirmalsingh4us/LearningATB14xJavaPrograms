package ex_30_Collection_framework.CF_01_List;

import java.util.Stack;

public class Lab_238_stack
{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("Nirmal");
        s.add("Singh");
        s.add("Muleh");

        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);

        System.out.println(s.pop());
        System.out.println(s);

        s.add("khalsa");
        System.out.println(s);

    }
}
