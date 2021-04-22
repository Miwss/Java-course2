import java.util.*;

class multiplicativeCipher {
    public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);
        int shift, i, n;
        String str;
        String str1 = "";
        String str2 = "";
        //System.out.println("Enter the plaintext");
        //str = sc.nextLine();
        str = "Hello";
        str = str.toLowerCase();
        System.out.println("Crypt word: " + str);
        n = str.length();
        char ch1[] = str.toCharArray();
        char ch3;
        char ch4;
        //System.out.println("Enter the value by which each letter of the string is to be shifted");
        //shift = sc.nextInt();
        shift = 3;

        System.out.println();
        System.out.println("Encrypted text is");

        for (i = 0; i < n; i++) {
            if (Character.isLetter(ch1[i])) {
                ch3 = (char) (((int) ch1[i] * shift - 97) % 26 + 97);
                str1 = str1 + ch3;
            } else if (ch1[i] == ' ') {
                str1 = str1 + ch1[i];
            }
        }
        System.out.println(str1);
    }
}