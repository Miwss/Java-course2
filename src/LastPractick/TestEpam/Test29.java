package LastPractick.TestEpam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Test29 {
    public static void main(String[] args) {
        File file = new File("C:\\file.txt");
        try {
            BufferedReader input = new BufferedReader(new FileReader(file));//Вставить нужно это
            int i;
            while((i = input.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch (Exception ex) {
            System.out.println("Exception");
        }
    }
}
/*
*Что нужно вставить вместо ... чтобы прочитать строку "Reading successful." из файла C:\file.txt и вывести её на экран (укажите все подходящие варианты)?
*
*Ответ:BufferedReader input = new BufferedReader(new FileReader(file)); или FileInputStream input = new FileInputStream(file);
*
*
*
*
* */