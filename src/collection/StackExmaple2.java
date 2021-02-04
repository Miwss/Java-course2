package collection;

import java.util.Stack;
import java.util.Vector;

public class StackExmaple2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Artem");
        stack.push("Oleg");
        stack.push("Katya");
        System.out.println(stack);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
