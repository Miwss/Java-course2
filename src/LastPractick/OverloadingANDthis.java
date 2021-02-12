package LastPractick;

public class OverloadingANDthis {
    String name;
    int age;
    OverloadingANDthis(){}//дефолтный контсркутор, позволяет не инициализировать обьекты при их создании
    OverloadingANDthis(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int abc(int a,int b){
        return a+b;
    }
    public double abc(double a, double b){
        return  a+b;
    }
    public String abc(String a, String b){
        return  a+b;
    }

    public static void main(String[] args) {
        OverloadingANDthis o1 = new OverloadingANDthis();
        System.out.println(o1.abc(2,2));
        System.out.println(o1.abc(3.14, 3.14));
        System.out.println(o1.abc("Hello ", "World"));
    }
}
/*1) Перегрузка методов — это приём программирования,
 который позволяет разработчику в одном классе для методов с разными параметрами использовать одно и то же имя.
 В этом случае мы говорим, что метод перегружен.

 2)this - Используется в теле любого метода для ссылки на текущий обьект*/