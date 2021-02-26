package LastPractick.TestEpam;

public class Test28 {
    public static void main(String[] args) {
        int i = 0, j = 5;
        tp: for (;;) {
            i++;
            for (;;) {
                if (i > --j) {
                    break tp;
                }
            }
            //System.out.println("i =" + i + ", j = " + j);
        }
    }
}
/*
*
*Что произойдет во время компиляции и выполнения данного фрагмента кода?
*
* Ответ: Ошибка компиляции
*
*
* Потому что: Ошибка компиляции из-за недостижимости кода "System.out.println("i =" + i + ", j = " + j);"
*
*
*
*
* */