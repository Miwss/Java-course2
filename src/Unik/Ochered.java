package Unik;

public class Ochered {
    public static void main(String[] args) throws InterruptedException {
        int min = 3000;
        int max = 10000;
       // int rnd = rnd(min,max);
        //System.out.println(" Псевдослучайное целое число: "+ rnd);
//        for (int i = 5; i > 0; i--) {
//            System.out.println(i);
//            try {
//                Thread.sleep(rnd);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        int i = 5;
        while(i>0){
            int j = rnd(min,max);
            System.out.println("Vremya dobavleniya: " + j);
            System.out.println(i);
            Thread.sleep(j);
            i--;
        }
        System.out.println("Konec");
    }

    public static int rnd(int min, int max){
        max -= min;
        return (int) (Math.random()* ++max) + min;
    }
}