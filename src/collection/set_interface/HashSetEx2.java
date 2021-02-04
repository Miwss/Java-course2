package collection.set_interface;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> hasset1 = new HashSet<>();
        hasset1.add(5);
        hasset1.add(2);
        hasset1.add(3);
        hasset1.add(1);
        hasset1 .add(8);

        HashSet<Integer> hasset2 = new HashSet<>();
        hasset2.add(7);
        hasset2.add(4);
        hasset2.add(3);
        hasset2.add(5);
        hasset2.add(8);

        HashSet<Integer> intersect = new HashSet<>(hasset1);
        intersect.retainAll(hasset2);
        System.out.println(intersect);
    }
}
