package collection.set_interface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<Integer> treeset = new TreeSet<>();
        treeset.add(5);
        treeset.add(8);
        treeset.add(2);
        treeset.add(1);
        treeset.add(10);//null hranit nelzya
        System.out.println(treeset);
    }
}
