package Unik;
import java.util.*;

public class WorkShakeSort {
    public static void main(String[] args) {
        int temp;
    Scanner input =  new Scanner(System.in); //Инициализация сканера
        System.out.println("Укажите длинну массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt() ;//заполняем массив
           // System.out.println(array[i] + " ");
        }
        //System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " "); //vivodim na ekran polycheniy massiv
        }
        //System.out.print("===================================");
        System.out.println();

        /*Сортировка массива*/
        int left = 0;
        int right = array.length - 1;

        do{
            for(int i = left; i < right; i++){
                if(array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            right--;
            for(int i = right; i > left; i--){
                if(array[i] < array[i-1]){
                    temp = array[i];
                    array[i]= array[i-1];
                    array[i-1] = temp;
                }
            }
            left++;
        }while(left < right);
       // System.out.println();
        for(int i: array){
            System.out.print(array[i - 1] + " ");
        }
    }
}
