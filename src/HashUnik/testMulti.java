package HashUnik;

public class testMulti {
    public static String multi(String s){
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

        shift = 23 * 31;
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

// Эта программа на Java предназначена для демонстрации мультипликативного шифра.
// Алгоритм Мультипликативный шифр может быть выражен в более математической форме следующим образом: En (x) = (x * n) mod 26
// Проще говоря, это означает, что шифрование буквы x равно сдвигу x * n, где n - количество сдвинутых букв. Затем результат процесса берется по модулю деления,
// что по сути означает, что если буква перемещается за конец алфавита, она переносится в начало, то есть мы снова начинаем с a. Расшифровка зашифрованного текста
// (зашифрованного текста) противоположна, мы умножаем зашифрованный текст на мультипликативную инверсию n, чтобы вернуть исходный текст. Dn (x) = (x * p) mod 26,
// где p = мультипликативная величина, обратная n.