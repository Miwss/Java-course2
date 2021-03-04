package Unik;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class CocktailSort
{
    int count = 0;
    void cocktailSort(int a[])
    {
        boolean swapped = true;//флаг для проверки и захода в цикл
        int start = 0;
        int end = a.length;

        while (swapped == true)
        {
            swapped = false;

            for (int i = start; i < end - 1; ++i) // Проходимся по массиву с 0 значения
            {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;//если у нас больше не двигаются элементы, то мы заканчиваем цикл и выходим с него
                    //count++;
                    swapped = true;
                }
            }
            if (swapped == false)// Если нечего двигать то массив отсортирован.
                break;

            swapped = false;//В проtивном случае, мы сами скидываем флаг
            end--;//уменьшаем на единицу, что бы заходит на -1 эелемент и не трогать отсортированные элементы
            for (int i = end - 1; i >= start; i--) {//проходим по массиву в обратном порядке
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    //count++;
                    swapped = true;
                }
            }
            start++;//Увеличиваем на единицу, что бы не трогать первый отсортерованный элемент, в противном случае мы будем терять скорость из за того что каждый раз сравниваем отсортированные элементы
            count++;
        }
    }

    /*Выводим содержимое массива на экаран */
    void printArray(int a[])
    {
        int n = a.length;
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        System.out.println("Количество итераций: " + this.count);
    }


//Мейн:)
    public static void main(String[] args) throws InterruptedException {
        Scanner input =  new Scanner(System.in); //Инициализация сканера
        System.out.println("Длинна массива: ");
        int size = input.nextInt();
        int a[] = new int[size];
        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < size; i++) {
            a[i] = input.nextInt();//заполняем массив
            // System.out.println(array[i] + " ");
        }
        CocktailSort ob = new CocktailSort();
        ob.cocktailSort(a);
        System.out.println("Отсортированый массив: ");
        ob.printArray(a);

//Проверка на время выполнения
        Instant starts = Instant.now();
        Thread.sleep(10);
        Instant ends = Instant.now();
        System.out.println(Duration.between(starts, ends));
    }
}