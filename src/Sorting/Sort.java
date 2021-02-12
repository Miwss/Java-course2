package Sorting;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class Sort{

    public static void main(String[] args) {
        People p1 = new People("Artem" ,21, "M");
        People p2 = new People("Sasha" ,19, "F");
        People p3 = new People("David" ,21, "M");
        People p4 = new People("Anya" ,18, "F");
        People p5 = new People("Anya" ,18, "q");

        ArrayList<People> array = new ArrayList<>();
        List<People> addM = new ArrayList<>();
        List<People> addF = new ArrayList<>();
        array.add(p1);
        array.add(p2);
        array.add(p3);
        array.add(p4);
        array.add(p5);


        //Predicate<People> pp = people -> {return people.getSex().equals('M');};
        for(People s: array){
            if(s.getSex() == "M"){
                addM.add(s);
            }
            else if(s.getSex() == "F"){
                addF.add(s);
            }else if(s.getSex() != "F" && s.getSex() !="M"){
                System.out.println("Error: " + s.getSex());
            }
        }
        System.out.println(addM);
        System.out.println("=============================");
        System.out.println(addF);
    }
}
