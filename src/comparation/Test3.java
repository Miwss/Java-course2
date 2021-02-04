package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        HashMap<Integer, Student> hm = new HashMap<>();
        Student st1 = new Student(3, "Artem", "Anistrai", 95);
        Student st2 = new Student(3, "Katya", "Topol", 93);
        Student st3 = new Student(2, "Sasha", "Timofeeva", 98);
        Student st4 = new Student(4, "Ivan", "Martynuk", 90);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        Collections.sort(list);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            hm.put(i, list.get(i));
        }
        System.out.println(hm);

//        list.add("Artem");
//        list.add("David");
//        list.add("Ivan");
//        list.add("Sasha");
//        list.add("Nastya");
//        Collections.sort(list);
//        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            hm.put(i, list.get(i));
//        }
//        System.out.println(hm);
//        System.out.println(hm.keySet());
//        System.out.println(hm.containsKey());

    }
}

class Student implements Comparable<Student>{
    int course;
    String name;
    String surname;
    int avg;

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", avg=" + avg +
                '}';
    }

    public Student(int course, String name, String surname, int avg) {
        this.course = course;
        this.name = name;
        this.surname = surname;
        this.avg = avg;
    }

    @Override
    public int compareTo(Student anotherStudents) {
//        int res = this.name.compareTo(anotherStudents.name);
//        if(res ==0)
//        {
//            res = this.surname.compareTo(anotherStudents.surname);
//        }
//        return res;
        if(this.avg == anotherStudents.avg){
            return 0;
        }else if(this.avg < anotherStudents.avg)
        {
            return 1;
        }else{
            return -1;
        }
    }
}

