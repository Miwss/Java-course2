package LastPractick;

public class StringBuilderEx1 {

    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("hello");
        st.append("!!!");
        System.out.println(st);
        st.append(">").append("<").reverse();
        System.out.println(st.toString());
    }
}
//В джаве существует два типа обьектов mutabe && inmutable - изменяимые и неизменяиемые!
//String - inmutable - неизменяемый обьект, при работе с этим обьектом мы будет возвращать новую строку а не основную
//StringBulder - mutable - в дальнейшем может проводить оперцаии и изменять свой первоначальный вид
//метод chaining - вызов методов для обьекта цепочкой
//если мы используем обычную строку в цикле и производим над ней часто какие то действия, то параллельно создаются копии, который выдают нам результат работы, что сказывается в скорости работы программы!