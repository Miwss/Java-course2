package LastPractick.TestEpam;

public class Test18 {
    public static void main(String[] args) {
        int i = 1;
        i = -+(10+2+i);
        //++i--;
        System.out.println(i);
    }
}
/*
* В какой строе кода содержится ошибка?
*
*
*
* Ответ: Строка 3
*
* Потому что, переменная не может содержать одновременно и ++ и --, компилятор не поймет что ему делать
*
*
*
* */