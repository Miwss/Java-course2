package nessted_classes.LocalInner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math{
    public void getResult(){
        class Delenie{
            private int delimoe;
            private int delitel;

            public int getDelemoe() {
                return delimoe;
            }

            public void setDelemoe(int delemoe) {
                this.delimoe = delemoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
            public int getChastnoe() {
                return delimoe / delitel;
            }
            public int getOstatok() {
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelemoe(21);
        delenie.setDelitel(4);
        System.out.println("Delimoe = " + delenie.getChastnoe());
        System.out.println("Delimoe = " + delenie.getOstatok());
    }
}