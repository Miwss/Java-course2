package LastPractick.TestEpam;


class Base{
    public String name = "Base";
    public String getName(){
        return name;
    }
}

class Sub extends Base{
    public String name = "Sub";
    public String getName(){
        return name;
    }
}


public class Test5 {
    public static void main(String[] args) {
        Sub s = new Sub();
        Base b = s;
        System.out.println(b.name);
    }
}
//Что произойдет во время компиляции и выполнения данного кода?

/*
*
* Ответ: Base
*
* Потому что, при наследовании и присвоении одного объекта класса другому, при наличии одинакового метода и поля, класс наследник будет ссылатся на суперкласс...
*
* */