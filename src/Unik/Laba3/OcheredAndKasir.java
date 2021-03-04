package Unik.Laba3;

import java.util.concurrent.ArrayBlockingQueue;

public class OcheredAndKasir {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        //Покупатель
        new Thread(()->{
            int i = 0;
            while (true){
                try {
                    queue.put(++i);
                    System.out.println("Человек встал в очередь под номером: " + i);
                    Thread.sleep(rndProducer());
                    //Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //Кассир
        new Thread(()->{
            while (true){
                try {
                    Integer j = queue.take();
                    System.out.println("Кассир обслуживает человека под номером: " + j);
                    Thread.sleep(rndConsumer());
                    //Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //Менеджер говорящий о количестве людей в очереди каждые 10 секунд
        new Thread(()->{
            while(true){
                int q = 0;
                try {
                    Thread.sleep(10000);
                    for (int j = 0; j < queue.size(); j++) {
                        q++;
                    }
                    System.out.println("Количество людей в очереди: " + q);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public static int rndProducer(){
        int min = 3000;
        int max = 10000;

        max -= min;

        return (int) (Math.random()* ++max) + min;
    }

    public static int rndConsumer(){
        int min = 5000;
        int max = 12000;

        max -= min;

        return (int) (Math.random()* ++max) + min;
    }
}
