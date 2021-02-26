package LastPractick.TestEpam;

public class Test39 {
    {
        System.out.print("1 ");
    }

    Test39(){
        System.out.print("2 ");
    }

    public static void main(String[] args) {
        System.out.print("3 ");
        Test39 m = new Test39();
        System.out.print("4 ");
    }

    static {
        System.out.print("5 ");
    }

}
//Что будет выведено следующей программой?
/*
*
* Ответ: 5-3-1-2-4
*
*
* Потому что:Первым инициализируется статический блок, далее управление передается main, вызывается конструктор и доинициализирует класс, вызывается функция внутри конструктора, окончание работы
*
*
*
*
* */