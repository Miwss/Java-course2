package collection;


import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExm {
    public static void main(String[] args) {
            String s ="madam";
        List<Character> list = new LinkedList<>();
        for(char ch: s.toCharArray()){
            list.add(ch);
        }
        //System.out.println(list);
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> Reverseiterator = list.listIterator(list.size());//list.size() - ykazivaet chto mi smotrim posledniy element
        boolean isPalindrom = true;
        while(iterator.hasNext() && Reverseiterator.hasPrevious()){
            if(iterator.next() != Reverseiterator.previous()){
                isPalindrom = false;
                break;
            }
        }
        if(isPalindrom){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOT palindrome");
        }

    }

}
