package Unik;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class BoobleSort {
    public static void main(String[] args) throws InterruptedException {

        Scanner input =  new Scanner(System.in); //Инициализация сканера
        System.out.println("Длинна массива: ");
        int size = input.nextInt();
        int mas[] = new int[size];
        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < size; i++) {
            mas[i] = input.nextInt() ;//заполняем массив
        }

        boolean isSorted = false;
        int count = 0;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;

                    //count +=1;
                }
            }
            count++;
        }

        System.out.println(Arrays.toString(mas) + "\n " + "Количество итераций: " + count);

        Instant starts = Instant.now();
        Thread.sleep(10);
        Instant ends = Instant.now();
        System.out.println(Duration.between(starts, ends));
    }
}
