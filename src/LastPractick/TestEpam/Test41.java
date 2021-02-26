package LastPractick.TestEpam;

public class Test41 {
    public static void main(String[] args) {
        byte k = 0;

//        switch(k) {
//            default:
//                int h = 3;
//                System.out.println(h);
//                break;
//            case 0:
//                int h = 7;
//                System.out.println(h);
//            case 1:
//                int h = 11;
//                System.out.println(h);
//        }
    }
}
/*
* Каким будет результат выполнения следующей программы?
*
*
* Ответ: Ошибка компиляции
*
*
*Потому что: Возникнет ошибка компиляции "h is already defined".
Локальные переменные, объявленные в блоке switch, имеют общую область видимости.
Чтобы избежать ошибки компиляции, можно использовать отдельный блок { } для каждого case / default.
*
* */