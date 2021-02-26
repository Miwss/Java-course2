package LastPractick.TestEpam;

public class Test30 {
}
class Class1 {
    Class1(int i) {
        System.out.println("Class1(int)");
    }
}

//class Class2 extends Class1 {
//    Class2(double d) {              // 1
//        this((int) d);
//        System.out.println("Class2(double)");
//    }

//    Class2(int i) {                 // 2
//        System.out.println("Class2(int)");
//    }

//    public static void main(String[] args) {
//        new Class2(0.0);
//    }
//}
/*
* Что произойдет в результате компиляции и запуска данного кода?
*
*Ответ: ошибка компиляции в строке 2
*
*
* Потмоу что: Конструктор должен обязательно вызывать либо другой конструктор этого же класса, либо конструктор суперкласса.
*
*
*
*
*
*
* */