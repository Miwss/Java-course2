package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);//sozdaem ob`ekt scanner
//        System.out.println("vvedite chislo");
//        int i = sc.nextInt();
//        System.out.println(i);



//        System.out.println("Vvedite 2 chisla");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.println("Chastnoe = " + x/y);
//        System.out.println("Ostatok = " + x%y);

//        System.out.println("Napishite slowo");
//        String s = sc.nextLine();
//        System.out.println(s);


//        System.out.println("vvedite chislo");
//        double d = sc.nextDouble();
//        System.out.println(d);

        Scanner scc = new Scanner("Privet moy drug!\nKak pojivaesh?" + "\nChto xoroshego?");
        while(scc.hasNextLine()){
            System.out.println(scc.nextLine());
        }
    }
}
