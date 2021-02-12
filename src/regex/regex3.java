package regex;

import java.util.Arrays;

public class regex3 {
    public static void main(String[] args) {
        String s
                = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," + " email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;"
                + "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18,"+
                " email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;"
                + "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

        String s2 = "chuck@gmail.com";
        boolean result = s2.matches("\\w+@\\w+.(com|ru)");//используем метод, когда нужно подтвердить или опровергнуть одно соответствие
        System.out.println(result);


        String [] array = s.split(" ");
        System.out.println(Arrays.toString(array));


    }
}
