package collection.map_interface;

import java.sql.Struct;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treemap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 3);
        Student st5 = new Student("Vasiliy", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 4);
        Student st7 = new Student("Elena", "Sidorova", 3);


        treemap.put(5.8, st1);
        treemap.put(6.4, st2);
        treemap.put(7.2, st3);
        treemap.put(7.5, st4);
        treemap.put(7.9, st5);
        treemap.put(8.2, st6);
        treemap.put(9.1, st7);


        System.out.println(treemap);
    }
}
