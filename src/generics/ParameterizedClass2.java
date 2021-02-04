package generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 1999);
        System.out.println(pair1.getFirstValue() + " " + pair1.getSecondtValue());
        Pair2<String> pr2 = new Pair2<>("Hello", ", World!");
        System.out.println(pr2.getFirstValue()+pr2.getSecondtValue());
    }
}
class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getFirstValue(){
        return value1;
    }
    public V2 getSecondtValue(){
        return value2;
    }
}
class Pair2<V>{
    private V value1;
    private V value2;

    public Pair2(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V getFirstValue(){
        return value1;
    }
    public V getSecondtValue(){
        return value2;
    }
}
