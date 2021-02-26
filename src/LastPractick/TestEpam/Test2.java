package LastPractick.TestEpam;

public class Test2 {
    public static void main(String[] args) {
        String x = "Java";
        x.concat(" Rules!");
        System.out.println("x = " + x);
        x.toUpperCase();
        System.out.println("x = " + x);
        x.replace('a', 'X');
        System.out.println("x = " + x);
    }
}
//Что будет выведено в результате выполнения данного кода?
/*x=Java
* x=Java
* x=Java*/
//Потому что Строка в джаве - неизменяемый обьект, тем самым,
// делая манипуляции над ней, джава создает копию и изменяет ее,
// что бы получить результат изменения, мы должны присвоить ее новой переменной,
// по скольку при вызове стринга мы получим дефолтное значение!