import java.util.Arrays;

public class arrayMulti {
    public void crypto(String[] arrStr){
        int shift, i, n;
        String str ="";
        String str1 = "";
        String str2 = "";
        //String[] arrayStr = new String[arrStr.length];

        for (int j = 0; j < arrStr.length; j++) {
            char ch1[] = arrStr[j].toCharArray();
            //str = str.toLowerCase();
            System.out.println("=====================");
            System.out.println("Crypt word: ");
            for (int k = 0; k < ch1.length; k++) {
                System.out.print(ch1[k]);

            }
            System.out.println();
           //System.out.println(n);

           // n = ch1[].length();
            //n=0;
            //System.out.println(n);
            //char ch1[] = str.toCharArray();

            //n = str.length();
            char ch3;
            char ch4;
            char ch5[] = new char[ch1.length];


            shift = 3; //Число по здвигу, можем менять.

            System.out.println();
            System.out.println("Encrypted text is:");

            for (i = 0; i < ch1.length; i++) {
                if (Character.isLetter(ch1[i])) {
                    ch3 = (char) (((int) ch1[i] * shift - 97) % 26 + 97);
                     ch5[i] = ch3;
                    //arrayStr[i] = str1;
                    //str1 = String.valueOf(ch3);
                } else if (ch1[i] == ' ') {
                    //str1 = String.valueOf(ch1[i]);
                    str1 = str1 + ch1[i];
                }
            }
            for (int k = 0; k < ch5.length; k++) {
                System.out.print("");
                System.out.print(ch5[k]);

            }
            System.out.println();
//            for (int k = 0; k < arrayStr.length; k++) {
//                System.out.println(arrayStr[k]);
//            }
           //System.out.println(str1);
            //str1 = null;

           // System.out.println(n);
            String[] strr = new String[1];
//            for (int k = 0; k < strr.length; k++) {
//                System.out.println(strr[k]);
//            }
            //System.out.println(strr.toString());
            for (int k = 0; k < strr.length; k++) {
                Arrays.toString(ch5);
                String str6 = String.valueOf(ch5);
                strr[k] = str6;
                //System.out.println(strr[k]);
            }
        }
    }

    public static void main(String[] args) {
        arrayMulti arr = new arrayMulti();
        String[] strar = {"one", "two", "tree", "four"};
        arr.crypto(strar);
    }
}
