package generics.DublikatIgry;

abstract public class Igroky {
    private String name;
    private int age;

    public Igroky(String name, int age){
        this.name = name;
        this.age  = age;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
}
