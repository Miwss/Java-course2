package lambda;


import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr){
        for(Student s: al){
            if(pr.test(s)){

                System.out.println(s);
            }
        }
    }
    void testS(ArrayList<Student> al, Predicate<Student> st)
    {
        for(Student s1: al){
            if(st.test(s1)){
                System.out.println(s1);
            }
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();

        Function<Student,Double> f = student -> student.avg;


////
//        info.testStudents(students, (Student s) ->{return s.avg > 8;});
//        info.testStudents(students, s -> s.avg > 8);
//        System.out.println("================================");
 //      Predicate<Student> p1 = student  -> student.avg > 8;//один из вариантов записи
//        Predicate<Student> p2 = student  -> student.sex == 'm';
//        System.out.println("================================");
//        info.testStudents(students, p1.and(p2));//обьединение проверок
//        info.testStudents(students, p1.or(p2));//выведи если одно из условий проходит
//        info.testStudents(students, p1.negate());//Противоположная проверка (Если в)
//
//        System.out.println("----------------------");
//        info.testStudents(students, (Student s) -> {return s.age < 30;});
//        System.out.println("------------------------");
//        info.testStudents(students, (Student s) ->{return s.avg > 8;});
//        System.out.println("------------------------");
//        info.testStudents(students, (Student s) ->{return s.age  > 20 && s.avg < 9.3 && s.sex == 'f';});
//                //info.printStudentOverGrgade(students, 8);
//        System.out.println("------------------------------------");
//        //info.printStudentUnderAge(students, 30);
//        System.out.println("---------------------------------------");
//       // info.printStudentMixCondition(students, 20, 9, 'f');

    }




//    void printStudentOverGrgade(ArrayList<Student> al, double grade){
//        for(Student s: al){
//            if(s.avg>grade){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentUnderAge(ArrayList<Student> al, int age1){
//        for(Student s:al){
//            if(s.age < age1);
//            System.out.println(s);
//        }
//    }
//    void printStudentMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s : al) {
//            if (s.age > age && s.avg < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}
//interface StudentChecks{
//    boolean check(Student s);
//}

//class CheckOverGrade implements StudentChecks{
//    @Override
//    public boolean check(Student s) {
//        return s.avg > 8;
//    }
//}


//Лямбда выражения позволяют нам заменят анонимные классы. Достаточно просто иметь интерфейс с методом, который мы запишем через лямбда выражение и оно будет работать, тем самым убираем создание лишнего класса и оверрайда метода.Что бы создать лямбда выражение, нужно Указать ТИп входящего параметра такой же как у метода интерфейса и  черех стрелочку в фигурных скобках указать реализацию.
//Можно записывать лямбда выраежния только тогда, когда интерфейс имеет только 1 абстрактный метод.