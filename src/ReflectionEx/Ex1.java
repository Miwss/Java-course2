package ReflectionEx;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("ReflectionEx.Employee");


        //Class employeeClass2 = Employee.class;


//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        Field someField = employeeClass.getField("id");
        System.out.println("Type of id field = " + someField.getType());
        System.out.println("=============================");

        Field[] fields = employeeClass.getFields();
        for(Field field: fields){
            System.out.println("Type of: " + field.getName() + " = " + field.getType());
        }
        System.out.println("=============================");
        Field [] allFields=employeeClass.getDeclaredFields();//polychaem i polya private
        for(Field s: allFields){
            System.out.println("Type of: " + s.getName() + " = " + s.getType());
        }
        System.out.println("=======================================");




       Method someMethod1 =  employeeClass.getMethod("increadeSalary");
        System.out.println("Retern type: " + someMethod1.getReturnType() + ", parameter types: " + Arrays.toString(someMethod1.getParameterTypes()));


        System.out.println("=======================================");

        Method someMethod2 =  employeeClass.getMethod("setSalary", double.class);
        System.out.println("Retern type: " + someMethod2.getReturnType() + ", parameter types: " + Arrays.toString(someMethod2.getParameterTypes()));

        System.out.println("=======================================");

        Method[] metods = employeeClass.getMethods();
        for(Method method: metods){
            System.out.println("Name of method: " + method.getName() +  " return type: " +method.getReturnType()+", parameter types: " + Arrays.toString(method.getParameterTypes()));
        }

    }
}
