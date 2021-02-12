package LastPractick;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] count = new int[10];
        for (int i = 0; i < count.length; i++) {
            count[i] = i;
            if(count[i] == 5)
            {
                count[i] = 0;
            }
            System.out.println(count[i]);
        }

    }
}
//array - облость памяти, котора хранит совокупность однотипных данных
