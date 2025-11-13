package ex_30_Collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Lab_231_nested_arraylist {
    public static void main(String[] args) {
        List<String> fruit1= new ArrayList();
        fruit1.add("Apple");
        fruit1.add("Banana");
        fruit1.add("Cherry");
        fruit1.add("Orange");
        System.out.println(fruit1);

        List <String> fruit2 = new ArrayList<>();
        fruit2.add("Mango");
        fruit2.add("Papya");
        fruit1.add("Watermelon");

        System.out.println(fruit2);


        List <String> Vegetable = new ArrayList<>();
        Vegetable.add("Patato");
        Vegetable.add("Onion");
        Vegetable.add("Tomato");
        System.out.println(Vegetable);

        List all_fruits_vegs= new ArrayList();

        all_fruits_vegs.add(fruit1);
        all_fruits_vegs.add(fruit2);
        all_fruits_vegs.add(Vegetable);

        System.out.println(all_fruits_vegs);
        System.out.println(all_fruits_vegs.size());
        System.out.println(all_fruits_vegs.get(2));

    }
}
