package LastPractick.TestEpam;
import java.text.NumberFormat;
public class Test44 {
    public static void main(String[] args) {
        float f = 123.45678f;
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        System.out.println(numberFormat.format(f));
    }

}
/*
*Какой результат компиляции и выполнения программы:
*
*
*Ответ: Программа выведет "123.46"
*
*Потому что: При форматировании произойдет округление числа
*
*Класс java.text.Format и его потомки (NumberFormat, DateFormat и т.д.) предназначены для формирования текстового представления объектов - чисел, дат и т.п. в соответствии с настройками локали.
Например, для чисел можно управлять отображением десятичного разделители и разделителя разрядов, правилами округления и т.п.
*
* */