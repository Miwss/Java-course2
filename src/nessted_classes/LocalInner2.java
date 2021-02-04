package nessted_classes;

public class LocalInner2 {
    public static void main(String[] args) {
        class Slojenie implements Math2{
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        }
        Slojenie sl = new Slojenie();
        System.out.println(sl.doOperation(5,3));
    }
}

interface Math2{
    int doOperation(int a, int b);
}