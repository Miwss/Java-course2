package Unik;

import java.util.Random;

public class ShakerSort {
    public static void main(String[] args) {
        int temp; // Переменная, в которую будем заносить значение
        int arraySize = 10;  // Задаём размер массива
        int[] array = new int[arraySize];
        Random newRandom = new Random();

        /*Объявление и Инициализация массива*/
        for (int i = 0; i < array.length; i++) {
            array[i] = newRandom.nextInt(10) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        /*Сортировка Массива шейкером*/
        int leftSide = 0;
        int rightSide = array.length - 1;

        do {

            for (int i = leftSide; i < rightSide; i++) { // Сортир. влево ищем МАКС. знач.


                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            rightSide--; // Уменьшаем количество проходов
            for (int i = rightSide; i > leftSide; i--) { // Теперь идём в обратную сторону ищем МИН.
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            leftSide++; // Уменьшаем количество проходов т.к. мы шли с конца исходя из условия
            // последнего for, что бы уменьшить кол-во проходокб нужно инкрементировать счётчик
        } while (leftSide < rightSide); // Априори наше условие при котором буду происходить
        // проходки

        for (int i : array
        ) {
            System.out.print(array[i -1] + " ");
        }
    }
}
