package LastPractick.TestEpam;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Test35 {
    public static void main(String[] args) {
        String[] str = new String[] { "1", "2", "3" };

        List list = Arrays.asList(str);
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Object object = (Object) iterator.next();
            iterator.remove();
        }
        System.out.println(list.size());
    }

}
/*
* Каким будет результат выполнения кода:
*
*Ответ: Произойдет ошибка времени выполнения
*
*
*Потому что:  Метод Arrays.asList() возвращает неизменяемый список – т.е. список, в который нельзя добавить или из которого нельзя удалить элементы.
Для этого используется внутренняя реализация списка, в которой методы для добавления или удаления элементов выбрасывают UnsupportedOperationException:
*
*
* */