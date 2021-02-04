package nessted_classes.anonymous_class;

public class AnonymousClass {
    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return 0;
            }
        };
    }
}

interface Math{
    int doOperation(int a, int b);
}