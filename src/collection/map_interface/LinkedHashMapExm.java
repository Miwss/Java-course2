package collection.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapExm {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm =  new LinkedHashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 3);
        Student st5 = new Student("Vasiliy", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 4);
        Student st7 = new Student("Elena", "Sidorova", 3);


        lhm.put(5.8, st1);
        lhm.put(6.4, st2);
        lhm.put(7.2, st3);
        lhm.put(7.5, st4);
    }
    //Элемены хранятся по мере их использования, если мы используем какой то метод к обьекту, этот обьект будет последний.
}
