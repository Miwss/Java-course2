package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {
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

       //students=  students.stream().filter(element->element.getAge() > 22 && element.getAvg() < 7.2).collect(Collectors.toList());
       // System.out.println(students);

//        students = students.stream().sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
//        System.out.println(students);
        students.stream().map(e->{e.setName(e.getName().toUpperCase()); return e;}).filter(e->e.getSex() == 'f').sorted((x,y)->x.getAge() - y.getAge()).forEach(e-> System.out.println(e));
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avg;

    public Student(String name, char sex, int age, int course, double avg) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avg=" + avg +
                '}';
    }
}