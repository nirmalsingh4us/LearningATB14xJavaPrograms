package ex_30_Collection_framework.CF_05_Comparable_Vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab_Comparator {
    public static void main(String[] args) {
//        Employee2 E1 = new Employee2(33, "Raminder");
//        Employee2 E2 = new Employee2(44,"Nisha");
//        Employee2 E3= new Employee2(55,"Ujjwala");

        List<Employee2> list  = new ArrayList<>();
        list.add(new Employee2(76,"Raminder"));
        list.add(new Employee2(42,"Nisha"));
        list.add(new Employee2(12,"Ujjawala"));
        System.out.println(list);
        Comparator<Employee2> nameCamparator = (e1,e2 )->e1.name.compareTo(e2.name);
        Comparator<Employee2> idCamparator = (e1,e2 )->e1.id-e2.id;
        Collections.sort(list,idCamparator);
        System.out.println(list);
    }
}


class Employee2{
int id;
String name;

public Employee2(int id, String name) {
    this.id = id;
    this.name = name;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}



@Override
public String toString() {
    return id + " - " + name;
}


public String printDetails(){
    return id + " - " + name;

}


}