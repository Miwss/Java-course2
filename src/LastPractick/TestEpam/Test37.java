package LastPractick.TestEpam;

public class Test37 {
    public static void main(String[] args) {
        Sente a = new Sente(); a.go();
        Goban b = new Goban(); b.go();
        Stone c = new Stone(); c.go();
    }
}
class Sente implements Go {
    public void go() { System.out.println("go in Sente"); }
}

class Goban extends Sente {
    public void go() { System.out.println("go in Goban"); }
}

class Stone extends Goban implements Go { }

interface Go { public void go(); }
/*
* Что произойдет при компиляции и исполнении кода:
*
*
*Ответ: go in Sente
        go in Goban
        go in Goban
*
*
* Потому что: Если у наследника и родителя имеется два одинаковых метода, то всегда выполняется метод наследника.(Не сильно вникай в объяснение, глянь лучше код и поймешь, тогда ты понял как раз)
*
* */