package Unik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearchAndSort {
    public static void main(String[] args) {
        int[] array = {3,2,1,3,5,2,1,2,5,52,1,2};
        sort(array);

    }
    public static void sort(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            int newElement = arr[k];
            int index;
            index = Arrays.binarySearch(arr, 0, k, newElement);
            if (index < 0) {
                index = -(index)-1;
            }
            System.arraycopy(arr, index, arr, index +1, k - index);
            arr[index] = newElement;
        }
        for(int i : arr){
            System.out.print(i + ", ");
        }
    }
}
