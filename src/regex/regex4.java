package regex;

public class regex4 {
    public static void main(String[] args) {
        String s1 = "Privet,moy     drug! Kak idet izuchenie   Java    ?";
        System.out.println(s1);
        //s1 = s1.replace("Java", "SQL");
        //s1 = s1.replaceAll(" {2,}"," ");//zamenyaem vse probeli na 1
        //s1 =s1.replaceAll("\\bi\\w+","4444");/zamenyaem slova na "i" na "4444"
        s1 = s1.replaceFirst("\\bi\\w+", "4444");//zamenyaem tolko pervoe sovpadenie
        System.out.println(s1);
    }
}
