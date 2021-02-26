package LastPractick.TestEpam;

public class Test1 {
    final int x = 1;

    public static void main(String[] args) {
        int x = 2;
        for(x = 3; x < 5; x++);
        System.out.println("x= " + x);
    }
}
//Какой результат будет получен при компиляции и выполнении данного кода?
//х = 5: потому что переменная созданная внутри мейна - локальная и ее зона видимиости является в методе мейн!