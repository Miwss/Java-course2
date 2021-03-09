package Unik.Laba3;

import Sorting.People;

import java.util.concurrent.ArrayBlockingQueue;

public class OcheredCherezClassi{
    public static void main(String[] args) {
        //ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread thread = new Thread(new Consumer());
        Producer producer = new Producer();
        Manager manager = new Manager();
        thread.start();
        producer.start();
        manager.start();

    }
}
//Pokypatel
class Producer extends Thread{
    ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    public void run(){
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
    }
    public static int rndProducer(){
        int min = 3000;
        int max = 10000;

        max -= min;

        return (int) (Math.random()* ++max) + min;
    }
}
//Kasir
class Consumer extends Producer {
    public  void run() {
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
    }
    public static int rndConsumer(){
        int min = 5000;
        int max = 12000;

        max -= min;

        return (int) (Math.random()* ++max) + min;
    }
}
//Opovewenie
class Manager extends Producer{
    public void run() {
        while (true) {
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
    }
}