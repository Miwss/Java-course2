package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<>();
        all.add(10);
        all.add(20);
        all.add(5);
        int a = GenMethod.getSecondElement(all);
        System.out.println(a);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("123");
        al2.add("456");
        al2.add("789");
        String s = GenMethod.getSecondElement(al2);
        System.out.println(s);
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}

