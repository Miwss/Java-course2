public class CharToInt {
    public static void main(String[] args) {
            String s = "HELLO";
            int ascii;
            char[] c_arr = s.toCharArray();
            int size = c_arr.length;
            int[] char_num = new int[size];

            for (int i = 0; i < c_arr.length; i++) {
                char c = c_arr[i];
                ascii = (int) c;
                char_num[i] = ascii;
                //System.out.println(ascii);
            }
        for (int i = 0; i < char_num.length; i++) {
            char_num[i] = char_num[i] * 4 % 33;
            int sfifrInt = char_num[i];
            char shifrChar = (char) sfifrInt;
            System.out.print(shifrChar);
        }

            //System.out.println();
    }
}
