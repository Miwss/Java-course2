package Multithreading;
import java.util.concurrent.TimeUnit;

public class Ex7 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
            //TimeUnit.SECONDS.sleep(3-10);
        }
        System.out.println("Поехали!!!");
    }
}
