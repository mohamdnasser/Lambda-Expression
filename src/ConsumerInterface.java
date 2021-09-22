import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String args[]) {

        /*
        * ex 1 :
        * take one parameter and doesn't return any value
        * */
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Welcome To Consumer Interface");


    }
}
