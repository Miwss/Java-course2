package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<>();

        List<Double> l2 = new ArrayList<>();
        l2.add(3.15);
        l2.add(3.16);
        l2.add(3.17);
        show(l2);
    }
    static void show(List<?> list){
        System.out.println("Test: " + list);
    }
}
