package Unik;

import java.util.*;


public class LonkedListLastParam {
    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList();
       list.add(1);
       list.add(2);
       list.add(100);
       list.add(4);
       list.add(5);
       list.add(6);
       list.get(0);
       System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == Collections.max(list)) {
                list.add(list.size(), list.get(i));
                list.remove(i);
                break;
            }
        }
        System.out.println(list);
    }
}