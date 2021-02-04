package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100,"Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15,"Ivan", "Petrov", 6542);
        Employee emp3 = new Employee(123,"Avan", "Sidorov", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n " + list);
        Collections.sort(list, new nameComparator());
        System.out.println("After Sorting \n " + list);
    }
}

class Employee implements Comparable<Employee>{
    @Override
    public int compareTo(Employee anotherEmp) {
//        if(this.id == anotherEmp.id){ // 5 Variant //Sravnivaet ID
//            return 0;
//        }
//        else if(this.id < anotherEmp.id){
//            return -1;
//        }
//        else{
//            return 1;
//        }
//        int res =this.name.compareTo(anotherEmp.name); //2 Variant //Сравнивает имена, если они одинаковые, то сравнивает фамилию.
//        if(res == 0){
//            res = this.surname.compareTo(anotherEmp.surname);
//        }
//        return res;
//        return this.id-anotherEmp.id; // 3 Variant - короткая проверка ID
        return this.name.compareTo(anotherEmp.name);//4 Variant //Проверка только по именан.
    }

    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class salaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.salary-emp2.salary;
    }
}
class nameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2){
        return emp1.name.compareTo(emp2.name);
    }
}