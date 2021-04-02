package Reflection_examples2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex3 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class employeeClass = Class.forName("Reflection_examples2.Employee");

//        //Примеры создания обьектов класса Employee через employeeClass
//        Employee o =  (Employee)employeeClass.newInstance();//перечеркнутая линия означает (деприкейтед - устаревший)
//        //Инстанс возвращает обьект класса Обжект - тем самым мы можем либо создать обьект такого типа, либо сделать кастинг в класс который нас интересует, что будет более правильно
//        System.out.println(o);

            //Конструктор может принимать в себя дженерики, тем самым мы можем без кастинга указать в дженериках тип Имплоии - нашего класса и спокойно без кастинга его использовать
        Constructor<Employee> constructor1 = employeeClass.getConstructor();
        Employee obj1 = constructor1.newInstance();

        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(5, "Artem", "IT");
        System.out.println(obj2);


        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2,800.88);// Что бы вызвать метод, используем метод инвок, в первый параметр передаем обьект с ктороым работаем, во второй указываем значения
        System.out.println(obj2);

    }
}
