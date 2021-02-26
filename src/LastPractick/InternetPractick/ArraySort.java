package LastPractick.InternetPractick;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = {10,20,321,7,5,1,2,3,2,1};

        int swap = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - i - 1 ; j++) {
//                if(array[j] > array[j+1]){
//                    swap = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = swap;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        for (int i = 0; i < array.length - 1 ; i++) {
            if(array[i] > array[i+1]){
                swap = array[i];
                array[i] = array[i+1];
                array[i+1] = swap;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
