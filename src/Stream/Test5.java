package Stream;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        int [] array = {56 ,2 ,4 ,3 ,8 ,532, 14, 2, 4, 2, 23, 05, 3 ,23 ,15 ,23 ,35, 62, 3, 4};
//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));
//
//        Instant starts = Instant.now();
//        Thread.sleep(10);
//        Instant ends = Instant.now();
//        System.out.println(Duration.between(starts, ends));
            int result = Arrays.stream(array).filter(e->e%2==1).map(e->{if(e%3==0){e=e/3;}return e;}).reduce((a,e)->a+e).getAsInt();
        System.out.println(result);
    }
}
