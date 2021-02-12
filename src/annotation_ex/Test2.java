package annotation_ex;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("annotation_ex.Xiaomi");
       Annotation annotation = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation;
        System.out.println("Annotation info from Xiaomi class: " + sm1.OS() +", " + sm1.yearOfCompanyCreation());
    }
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android"; //default pri isppolzovanii anotacii vu mojete ne zadavat znacheniya elementam
    int yearOfCompanyCreation() default 2010;
}

@SmartPhone
class Xiaomi{
    String model;
    double price;
}
@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone{
    String model;
    double price;
}