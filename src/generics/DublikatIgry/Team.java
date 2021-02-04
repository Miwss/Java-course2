package generics.DublikatIgry;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Igroky> {
    private String name;
    private List<T> igroky = new ArrayList<>();
    public Team(String name){this.name = name;}
    public void addIgrokov(T Igrok){
        igroky.add(Igrok);
        System.out.println("V komandy dobavlen Igrok: " + Igrok.getName());
    }
    public  void StartGame(Team team){
        String winnerGame;
        Random random = new Random();
        int i = random.nextInt(2);
        if(i == 0){
            winnerGame = this.name;
        }else{
            winnerGame = team.name;
        }
        System.out.println("Pobedili: " + winnerGame);
    }
}
