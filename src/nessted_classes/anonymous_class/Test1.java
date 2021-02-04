package nessted_classes.anonymous_class;

public class Test1 {
    public static void main(String[] args) {
        abc a = new abc() {
            @Override
            public void abc1() {

            }
        };
    }
}

interface abc{
    void abc1();
}
