package comparation;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        HashMap<Integer, String> Hm = new HashMap<>();
        list.add("David");
        list.add("Ivan");
        list.add("Artem");
        System.out.println(list);
        System.out.println(" ");
        Collections.sort(list);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Hm.put(i, list.get(i));
        }
        System.out.println(Hm);
    }
}
