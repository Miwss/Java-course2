package LastPractick.TestEpam;

//public class Test22 {
//    public static void main(String[] args) {
//        A  alpha = new B(0);
//    }
//}
//
//class A{
//    A(int x){  \\1
//        a(x);  \\2
//    }
//    void a(int x){
//        System.out.println("A-a^ " + x);
//    }
//}
//
////class B extends A{
//   // B(int x){    \\3
//    //    a(x);    \\4
//   // }
//    void a(int x){
//        System.out.println("B-b: " x);
//    }
//}


/*
* Что будет результатом запуска такого кода?
*
*
* Ответ: Ошибка в строке 3
*
*
* Потому что: В классе A отсутствует конструктор по-умолчанию, поэтому конструктор класса B (потомок) первым делом должен явно вызвать один из обьявленных конструкторов класса-родителя.
*
* */