package LastPractick.TestEpam;

public class Test17 {
    public static void main(String[] args) {
        byte b[] = new byte[80];
        for(int i = 0; i <b.length; i++){
         //   b[i] = (byte)System.in.read();
            System.out.println("Ok");
        }
    }
}
//Что будет результатом компиляции и запуска данного кода?
/*
* Ответ: Ошибка компиляции, так как метод read() может порождать исключительную ситуацию тпа IOException
*
*
* */