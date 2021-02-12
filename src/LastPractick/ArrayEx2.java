package LastPractick;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] x = new int[100];
        for (int i = 0; i <= x.length; i++) {
            System.out.println("  ");
            for (int j = i; j > 0 ; j--) {
                System.out.print("* ");
            }
        }
    }
}
//Varargs — или Variable Arguments — это технология, которая позволяет создавать методы с произвольным количеством аргументов.