package LastPractick.TestEpam;

public class Test15 {
    public static void main(String[] args) {
        boolean b = true;
        int x = 0;

        do{
            if(x++ > 5)
                b = false;
            System.out.print(x);
        }while(b);
    }
}
