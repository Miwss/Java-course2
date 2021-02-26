package Unik.LinkListEx;


import Sorting.Sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.*;

public class List {
    private LinkedList head;
    private int count;
    int size = 0;



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
    public void showww(){
        System.out.println();
    }

//    public LinkedList sort(LinkedList nodeSort){
//        for (int i = size - 1; i >= 1; i++) {
//            LinkedList finalval = nodeSort;
//            LinkedList tempNode = nodeSort;
//
//            for (int j = 0; j < i; j++) {
//
//                int val1 = (int) nodeSort.value;
//                LinkedList nextnode = nodeSort.next;
//                int val2 = (int) nextnode.value;
//                if(val1 > val2){
//                    if(nodeSort.next.next != null){
//                        LinkedList CurrentNext = nodeSort.next.next;
//                        nextnode.next = nodeSort;
//                        nodeSort.next.next = CurrentNext;
//                        if(j == 0){
//                            finalval = nextnode;
//                        }else{
//                            nodeSort = nextnode;
//                        }
//                        for (int l = 0; l < j; l++) {
//                            tempNode = tempNode.next;
//                        }
//
//                        if(i != 0){
//                            tempNode.next = nextnode;
//
//                            nodeSort = tempNode;
//                        }
//                    }else if(nodeSort.next.next == null){
//                        nextnode.next = nodeSort;
//                        nextnode.next.next = null;
//                        for (int l = 0; l < j; l++) {
//                            tempNode = tempNode.next;
//                        }
//                        tempNode.next = nextnode;
//                        nextnode = tempNode;
//                        nodeSort = tempNode;
//                    }
//                }else
//                    nodeSort = tempNode;
//                nodeSort = finalval;
//                tempNode = nodeSort;
//                for (int k = 0; k <=j && j < i - 1; k++) {
//                    nodeSort = nodeSort.next;
//                }
//            }
//        }
//        return nodeSort;
//    }

//    @Override
//    public int compareTo(LinkedList o) {
//       if(this.head == o.next){
//           return 0;
//       }
//       else if(this.head.value < o.next.value){
//           return -1;
//       }
//       else{
//           return 1;
//       }
//    }



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

