package regex;

import java.util.stream.Stream;

public class PrintfEx {

    static void employeeInfo(Employee emp){
        System.out.printf("%03d \t %-12s \t %-12s \t %,.1f \n",emp.id, emp.name, emp.surmane, emp.salary * (1+emp.bonusPct));
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Zaur", "Tregulov", 12345, 0.15);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542, 0.08);
        Employee emp3 = new Employee(123, "Mariya", "Sidorova", 8542, 0.12);

        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);

        String newString = String.format("%03d \t %-12s \t %-12s \t %,.1f", 1, "Zaur", "Tregulov", 12345*(1+0.15));
        System.out.println(newString);
    }
}

class Employee{
    int id;
    String name;
    String surmane;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surmane, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surmane = surmane;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}