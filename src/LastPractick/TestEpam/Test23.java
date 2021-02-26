package LastPractick.TestEpam;

public class Test23 {
    public static void main(String[] args) {
        String s1 = new String("Bicycle");
        String s2 = new String("bicycle");
        System.out.println(s1.equals(s2) == s2.equals(s1));
    }

}
/*
* Выберите единственный верный из приведенных результат компиляции и выполнения кода
*
*1)ошибка компиляции
*2)Программа выведет "тру" без кавычек
*3)Программа выведет "фолс" без кавычек
*4)Программа выведет "фолс == фолс" без кавычек
*5)Программа выведет "Тру == Тру" без кавычек
*
*
*
* ответ: тру
*
* Потому что: false == false вот Вам и true
*
* */