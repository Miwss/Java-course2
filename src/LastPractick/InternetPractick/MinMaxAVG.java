package LastPractick.InternetPractick;

public class MinMaxAVG {
    public static void main(String[] args) {
        int[] array = {2,1,3,2,4,2,64,324};

        int max = array[0];
        int min = array[0];
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }else if(array[i] < min){
                min = array[i];
            }
            avg = avg + array[i];
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("AVG: " + avg);
    }
}
