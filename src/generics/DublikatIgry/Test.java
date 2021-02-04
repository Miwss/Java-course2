package generics.DublikatIgry;

public class Test {
    public static void main(String[] args) {
        footbolisty f1 = new footbolisty("jora", 12);
        footbolisty f2 = new footbolisty("Grisha", 15);

        atlety a1 = new atlety("Masha", 18);
        atlety a2 = new atlety("Anya", 19);

        Team<footbolisty> foot = new Team<>("Zalupka");
        Team<atlety> at = new Team("Devki");

        foot.addIgrokov(f1);
        foot.addIgrokov(f2);

        foot.StartGame(foot);

    }
}
