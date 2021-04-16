package Unik.Tree;

import java.util.Random;

public class springTest {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] mas = new int[10];
        for (int j = 1; j < mas.length; j++) {
            mas[j] = rand.nextInt(20);
        }
        for(int q:mas) {
            System.out.println(q);
        }
    }
}