package Kniga.Igra;

public class Player {
    int number = 0; // Здесь хранится вариант числа
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, это число " + number);
    }
}

