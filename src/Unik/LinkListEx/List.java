package Unik.LinkListEx;


import Sorting.Sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.*;

public class List implements Comparable<LinkedList> {
    private LinkedList head;



    private int count;

    public int getCount(){
        return count;
    }

    public List(){
        head = null;
    }
    private boolean isEmpty(){
        return head == null;
    }
    public void add(int value){
        LinkedList temp = new LinkedList(value);
        temp.next = head;
        head = temp;
        count++;
    }
    public void print(){
        LinkedList temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    @Override
    public int compareTo(LinkedList o) {
       if(this.head == o.next){
           return 0;
       }
       else if(this.head.value < o.next.value){
           return -1;
       }
       else{
           return 1;
       }
    }

    //    public void sort(List value){
//        int i;
//        LinkedList temp = new LinkedList(value);
//        while(temp!=null){
//            if(temp.next.value > temp.next.next.value){
//                i = temp.next.value;
//                temp.next.value = temp.next.next.value;
//                temp.next.next.value=i;
//                temp = temp.next;
//            }
//        }
//        System.out.println(head);
//    }
}

