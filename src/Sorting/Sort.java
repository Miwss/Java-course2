package Sorting;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort{

    public static void main(String[] args) {
        People p1 = new People("Artem" ,21, "M");
        People p2 = new People("Sasha" ,19, "F");
        People p3 = new People("David" ,21, "M");
        People p4 = new People("Anya" ,18, "F");

        ArrayList<People> array = new ArrayList<>();
        List<People> addM = new ArrayList<>();
        List<People> addF = new ArrayList<>();
        array.add(p1);
        array.add(p2);
        array.add(p3);
        array.add(p4);
        for(People s: array){
            if(s.getSex() == "M"){
                addM.add(s);
            }
            else if(s.getSex() == "F"){
                addF.add(s);
            }
            else{
                System.out.println("Такого гендера нет!");
            }
        }
        System.out.println(addM);
        System.out.println("=============================");
        System.out.println(addF);
    }
}
