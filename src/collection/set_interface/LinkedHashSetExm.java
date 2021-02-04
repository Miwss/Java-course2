package collection.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetExm {
    public static void main(String[] args) {
        LinkedHashSet<Integer>  lhs = new LinkedHashSet<>();
        lhs.add(5);
        lhs.add(3);
        lhs.add(1);
        lhs.add(8);
        lhs.add(10);
        System.out.println(lhs);
    }
}
//используем когда нужен хеш сет, но запоминать последовательность добавления