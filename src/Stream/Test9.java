package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        List<Integer> courses=students.stream().mapToInt(el-> el.getCourse())
                .boxed()
                .collect(Collectors.toList());
        System.out.println(courses);


//
//        Student min = students.stream().min((a,b)->a.getAge() - b.getAge()).get();
//        System.out.println(min);
//        Student max = students.stream().max((a,b)->a.getAge() - b.getAge()).get();
//        System.out.println(max);

        //students.stream().filter(e->e.getAge() > 20).limit(2).forEach(System.out::println);
    }
}
