package Unik.DoublyLinkedList;

import Unik.LinkListEx.List;

import java.util.Collections;
import java.util.regex.Pattern;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;


    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
    }
        public DoublyLinkedList(){
            this.head = null;
            this.tail = null;
            this.length = 0;
        }
        public boolean isEmpty(){
            return length == 0; //Если head == null
        }
        public int length(){
        return length;
        }
        public void add(int value){
            ListNode newNode = new ListNode(value);
            if(isEmpty()){
                head = newNode;
            }else{
                tail.next = newNode;
            }
            newNode.previous = tail;
            tail= newNode;
            length++;
        }
        public void print(){
            if(head == null){
                System.out.println("List is Empty");
            }
            ListNode temp = head;
            while (temp != null){
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
            System.out.println();
        }
        public int getMaxValue(){
            ListNode temp = head;
        if(temp == null){
            System.out.println("List is Empty");
            return 0;
        }
            int max = Integer.MIN_VALUE;
            while(temp!=null) {
                if (temp.data > max) {
                    max = temp.data;
                }
                temp = temp.next;
            }
            return max;
        }
        public void insertLast(int value){
            ListNode temp = new ListNode(value);
            if(isEmpty()){
                head = temp;
            }else {
                tail.next = temp;
                temp.previous = tail;
            }
            tail = temp;
            length++;
        }
        public void LastMaxValue(){
            insertLast(getMaxValue());
        }
        public ListNode removeElements(int val){
            while (head!=null && head.data == val){
                head = head.next;
            }
            ListNode current_node = head;
            while(current_node !=null && current_node.next !=null){
                if(current_node.next.data == val){
                    current_node.next = current_node.next.next;
                    break;
                }
            }
            return head;
        }
        public void AddMaxValueToEnd(){
            LastMaxValue();
            removeElements(getMaxValue());
            print();
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(32);
        dll.add(123123113);
        dll.add(10);
        dll.add(2);
        dll.add(500);
        dll.print();

        dll.AddMaxValueToEnd();
    }
}
