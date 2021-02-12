package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCCFABCGABCE";
//        Pattern pattern1 = Pattern.compile("ABC");

//        String s1 = "ABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");

//
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");


//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)");//следующий символ будет  (e либо 5)

//          String s1 = "abcd abce abc5abcg6abch";
//          Pattern pattern1 = Pattern.compile("abc.");// ищи нам стринг в шаблоне + любой символ после

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("^abc");//соответствует ли начало строки данному высказыванию

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("bch$"); //будет ли конец строки такой

//
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("[0-9]");//poisk lybogo chisla
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\d");//rabotaet tak je kak s 0-9, oznachaet odna cifra ot 0 do 9
        //dvoinoy backslash =  nazivaetsa  "escape Symbol"


//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\D");//vse krome cifer

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w");//vse krome probela

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\W");//vse probeli


//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w+");


//        String s1 = "abcd @#$abce $#@abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\W+");


//        String s1 = "poka abc Zaur dom kino";
//        Pattern pattern1 = Pattern.compile("\\w{4}");//vuvodit vse povtoreniya v diapazone 4 simvolov

        String s1 = "poka abc   Zaur          dom kino";
        Pattern pattern1 = Pattern.compile("\\w\s+\\w");

        Matcher matcher = pattern1.matcher(s1);
        while(matcher.find()){
            System.out.println("Position: " + matcher.start() + "    " + matcher.group());
        }
    }
}
