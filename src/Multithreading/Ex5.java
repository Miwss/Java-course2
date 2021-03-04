package Multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("moy_potok");
        myThread5.setPriority(9);
        System.out.println("Name of myThread5 = " + myThread5.getName() +
                " Priority of myThread5 = " + myThread5.getPriority());
    }
}

class MyThread5 extends Thread{
    public void run(){
        System.out.println("privet");
    }
}
