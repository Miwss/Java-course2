package collection;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestBinarySearch {
    public static void main(String[] args) {
        Student st1 = new Student("Artem", 21, 3);
        Student st2 = new Student("Katya", 19, 3);
        Student st3 = new Student("Mark", 20, 3);
        Student st4 = new Student("Sasha", 19, 2);
        Student st5 = new Student("Ivan", 20, 4);

        List<Student> arrayStudents = new ArrayList<>();
        arrayStudents.add(st1);
        arrayStudents.add(st2);
        arrayStudents.add(st3);
        arrayStudents.add(st4);
        arrayStudents.add(st5);

        Collections.sort(arrayStudents);
        System.out.println(arrayStudents);
        int index = Collections.binarySearch(arrayStudents, new Student("Sasha", 19, 2)); // iwem dsnnogo studenta
        System.out.println(index);

    }
}

class Student implements Comparable<Student> { // sortirovka massiva


    private String name;
    private int age;
    private int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student st) {
        int result = this.course - st.course;
        if(result == 0){
            result = this.name.compareTo(st.name);
        }
        return result;
    }
}