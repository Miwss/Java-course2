package LastPractick.TestEpam;

public class Test6 {
    public static void main(String[] args) {
        int x = 18;
        int y = x++;
        if(x == 18 && y > 10){
            System.out.println("y= " + y);
            System.out.println("x= " + x);
        }
    }
}
/*
* Выведится ли текст, помещенный в блок условного оператора?
*
* Ответ: Нет
*
*
* Потому что, когда мы присваиваем У = Х++, то в этот момент меняется и сама переменная Х, тем самым становится Х = 19.
* */