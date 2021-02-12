package annotation_ex;

import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {

        Parent p = new Child("Zaur");
        p.showInfo();
    }
}

class Parent{
    String name;

    public Parent(String name){
        this.name = name;
    }
    @Deprecated //ystarevwiy method
    void showInfo(){
        System.out.println("Its Parent class. Name = " + name);
    }
}

class Child extends Parent{

    public Child(String name) {
        super(name);
    }
    @Override
    void showInfo(){
        System.out.println("Its Child class = " + name);
    }
}