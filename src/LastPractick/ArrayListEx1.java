package LastPractick;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Artem");
        al.add("David");
        al.add("Vanya");
        al.add("Lesha");
        System.out.println(al);
        al.remove("Vanya");
        System.out.println(al);
        System.out.println(al);
        System.out.println(al.get(0));
        System.out.println(al.toArray());

    }
}
//ArrayList - Основан на массиве, быстрый в поиске обьекта, удаление и добавление, изменение их. Это массив, который может изменять свой размер, используем когда не знаем какой может быть длинна у структуры.
//HashMap -
//HashSet -
//LinkedList - Это элементы одной цепочки. Эти элементы хранят определенные данные, а так же ссылки на предыдущий и следующий обьект.