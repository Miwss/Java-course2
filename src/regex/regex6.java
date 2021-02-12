package regex;

import java.util.regex.Pattern;

public class regex6 {

    void checkIp(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        //((25[0-5]  |     2[0-4]\d  |     [01]?\d?\d)            (\.))
        // 250-255   или   200-249   или   0-199                   после точки  в {3} повтори 3 раза
        System.out.println(ip+ " is ok? " + Pattern.matches(regex, ip));
    }
    public static void main(String[] args) {
        String ip1 ="255.38.192.99";
        String ip2 ="182.262.91.05";
        regex6 r6 = new regex6();
        r6.checkIp(ip1);
        r6.checkIp(ip2);

    }
}
