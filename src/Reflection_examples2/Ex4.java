package Reflection_examples2;

import java.lang.reflect.Field;

public class Ex4 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10,"Artem", "IT");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");

        field.setAccessible(true);//мы хотим получить доступ к полю, даже если он прайвет.

        double salaryValue = (double)field.get(employee);
        System.out.println(salaryValue);

        field.set(employee, 2000);
        System.out.println(employee);


    }
}
