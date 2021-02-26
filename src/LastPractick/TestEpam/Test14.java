package LastPractick.TestEpam;


class A{
    int i = 0;
    public int increment(){
        return ++i;
    }
}

class B extends A{
    int i = 1;//1
    public int increment(){
        return ++i;
    }

    public static void main(String[] args) {
        B b = (B) new A();//2
        System.out.println(b.increment());
    }
}
public class Test14 {
}
/*
* Что произойдет в результате компиляции и выполнения следующего кода?
*
*
* Ответ: Ошибка компиляции во 2 строке
*
*
*
*
* */