package Unik;

public class testMulti {
    public String multi(String s){
        int shift, i, n;
        String str;
        String str1 = "";
        String str2 = "";
        str = s;
        str = str.toLowerCase();
        //System.out.println("Word" + str);
        n= str.length();
        char ch1[] = str.toCharArray();
        char ch3;
        char ch4;

        shift = 3;
//        System.out.println();
//        System.out.println("Encrypt text is: ");


        for (int j = 0; j < n; j++) {
            if (Character.isLetter(ch1[j])) {
                ch3 = (char) (((int) ch1[j] * shift - 97) % 26 + 97);
                str1 = str1 + ch3;
            } else if (ch1[j] == ' ') {
                str1 = str1 + ch1[j];
            }
        }
        return str1;
    }
}