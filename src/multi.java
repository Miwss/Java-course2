import java.util.Scanner;

public class multi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a mod: ");
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if((i*j)%num==1){
                    System.out.println("("+i+";"+j+")");
                }
            }
        }

    }
//    public  static void hash(String s){
//        int ascii;
//        char[] c_arr = s.toCharArray();
//        for (int i = 0; i < c_arr.length; i++) {
//            char c = c_arr[i];
//            ascii = (int) c;
//
//        }
//        System.out.println();
//    }
}
