package collection;


import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test1 {
    public static void main(String[] args) {
        String s = "mada";
        List<Character> list = new LinkedList<>();
        for(char c: s.toCharArray()){
           list.add(c);
        }
        //System.out.println(list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> iteratorRev = list.listIterator(list.size());
        boolean b = true;
        while(iterator.hasNext() && iteratorRev.hasPrevious()){
            if(iterator.next() != iteratorRev.previous()){
                b = false;
                break;
            }
        }
        if(b){
            System.out.println("Polendrom");
        }
        else{
            System.out.println("NOT");
        }
    }
}
