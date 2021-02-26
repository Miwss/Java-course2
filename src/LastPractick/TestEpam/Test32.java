package LastPractick.TestEpam;

public class Test32 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        Integer c = -128;
        Integer d = -128;
        System.out.println(a == b);
        System.out.println(c == d);
    }
}
/*Что будет выведено на экран?
 *
 *Ответ: false/true
 *
 *потому что: Т.к. в Integer pool попадают значения от -128 до 127
 *
 */
