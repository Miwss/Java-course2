package LastPractick.TestEpam;

public class Test27 {
    public static void main(String[] args) {
        int myInt = 0;
        float myFloat = 0;
        try {
            float result = myFloat / myFloat;
        } catch (RuntimeException re) {
            System.out.println("Exception 1");
        }

        try {
            float result = myFloat / myInt;
        } catch (RuntimeException re) {
            System.out.println("Exception 2");
        }

        try {
            float result = myInt / myFloat;
        } catch (RuntimeException re) {
            System.out.println("Exception 3");
        }

        try {
            float result = myInt / myInt;
        } catch (RuntimeException re) {
            System.out.println("Exception 4");
        }
    }
}
/*
* Каким будет результат компиляции и выполнения следующей программы?
*
* Ответ: Exception 4
*
* Потому что:
* Деление на ноль допустимо только для вещественных чисел. Результатом такой операции будет NaN (not a number) в случае деления ноль на ноль, либо плюс/минус бесконечность (Infinity) - в случае ненулевого делимого и нулевого делителя.
При делении целочиселнных переменных (как в варианте 4) возникнет ArithmeticException из-за деления на ноль (division by zero).
*
* -т.е. при float / int отработает неявное приведение типов
*
*
* -Для Дробових чисел ==> 4.4 / 0 => Infinity, 0 / 4.4 => 0.0, 0.0 / 0.0 => NaN
Для Цілих ==> 4 / 0 => ArithmeticException, 0 / 4 => 0
* */