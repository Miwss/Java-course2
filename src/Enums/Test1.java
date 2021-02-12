package Enums;

public class Test1 {
    void method(String dayOfWeek){
        System.out.println("Today is " + dayOfWeek);
    }

    public static void main(String[] args) {
        Test1 t =new Test1();
        t.method("Mondey");
    }
}
