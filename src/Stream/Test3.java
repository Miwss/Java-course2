package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5,9,3,8,1};
//        Arrays.stream(array).forEach(element -> {element*=2;
//            System.out.println(element);});
//        Arrays.stream(array).forEach(Utils::myMethod  );
//        Stream<Student> myStream = Stream.of(st1,st2,st3,st4,st5);//редкий случай, но с нуля можно создавать
    }
}
class Utils{
    public static void myMethod(int a){
        a=a+5;
        System.out.println("Element = " + a);
    }
}