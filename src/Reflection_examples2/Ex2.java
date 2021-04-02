package Reflection_examples2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("Reflection_examples2.Employee");

//        Class employeeClass2 = Employee.class;
//
//
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();


        //Получаем доступ к конкретному одному полю, по имени
        Field someFild = employeeClass.getField("id");
        System.out.println("Type of id field = " + someFild.getType());

        System.out.println("=====================================");
        //Получаем доступ ко всем полям, возвращает массив
        Field[] fields = employeeClass.getFields();
        for(Field field: fields){
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        System.out.println("=====================================");

        //Получаем доступ ко всем полям, даже прайвет
       Field[] allFields =  employeeClass.getDeclaredFields();
        for(Field field: allFields){
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        System.out.println("======================");
        //Получаем информацию о конкретном методе, по имени
        Method someMethod1 =  employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " +
                someMethod1.getReturnType() + ", parameter types = " +
                Arrays.toString(someMethod1.getParameterTypes()));


        System.out.println("======================");
        //Получаем информацию о конкретном методе с параметрами, по имени + указываем тип параметра + .class, если не указать, то выбросится ошибка
        Method someMethod2 =  employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " +
                someMethod2.getReturnType() + ", parameter types = " +
                Arrays.toString(someMethod2.getParameterTypes()));


        System.out.println("========================================");
        //Получаем доступ вообще ко всем методам, кроме прайвет
       Method[] methods = employeeClass.getMethods();
       for(Method method:methods){
           System.out.println("Name of method =  " + method.getName() +
                   ", return type = " +
                   method.getReturnType() +
                   ", parameter types = " +
                   Arrays.toString(method.getParameterTypes()));
       }

        System.out.println("========================================");
        //Получаем доступ ко всем методам, даже прайвет, только к тем, которые мы переопределили
        Method[] allMethods = employeeClass.getDeclaredMethods();
        for(Method method:allMethods){
            System.out.println("Name of method =  " + method.getName() +
                    ", return type = " +
                    method.getReturnType() +
                    ", parameter types = " +
                    Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("==================================");
        //Возвращает метод только с паблик доступом, через проверку в ифах
        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        for(Method method:allMethods2){
            if(Modifier.isPublic(method.getModifiers()))
            System.out.println("Name of method =  " + method.getName() +
                    ", return type = " +
                    method.getReturnType() +
                    ", parameter types = " +
                    Arrays.toString(method.getParameterTypes()));
        }


        System.out.println("==================================");
        //Получение конкретного конструктора
        Constructor constructor1 = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor1.getParameterCount() +
                " parameters, their types are: " +
                Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("==================================");
        //Получение конструктора с параметрами
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() +
                " parameters, their types are: " +
                Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("==================================");
        //Получение всех конструкторах
        Constructor[] constructor3 = employeeClass.getConstructors();
        for(Constructor constructor: constructor3)
        System.out.println("Constructor  "+ constructor.getName() +
                "Constructor has " + constructor.getParameterCount() +
                " parameters, their types are: " +
                Arrays.toString(constructor.getParameterTypes()));

    }
}
