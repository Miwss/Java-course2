package GraphUnik;


import java.io.PrintWriter;
import java.util.Scanner;

public class Graph {
    void solve(Scanner in, PrintWriter out){
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int color[] = new int[n];
        for (int i = 0; i < n; i++) {
            color[i] = in.nextInt();
        }
        int bad =0;
        for(int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) {
                if(color[i] != color[j] && a[i][j] == 1){
                    bad++;
                }
            }
        }
        System.out.println(bad);
    }
    void run(){
        try (Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {

            solve(in, out);
        }
    }
    public static void main(String[] args) {
        new Graph().run();
    }
}
//В входные данные передаем значение с задания.)