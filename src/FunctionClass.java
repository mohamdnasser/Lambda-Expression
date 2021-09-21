import java.util.function.Function;

public class FunctionClass {
    public static void main(String args[]) {

        /*
        * Examole 1 :
        * Integer parameter and Integer return datatype
        * */
        Function<Integer,Integer> f = n -> (n * n);
        System.out.println(f.apply(5));  //25
        System.out.println(f.apply(10)); //100
        System.out.println(f.apply(20)); //400

        System.out.println("===========================================");

        /*
         * Examole 2 :
         * String parameter and Integer return datatype
         * */
        Function<String,Integer> f1 = s -> (s.length());
        System.out.println(f1.apply("Welcome"));  //7
        System.out.println(f1.apply("Nasser"));   //6
        System.out.println(f1.apply("Omar"));     //4

        System.out.println("===========================================");

        /*
         * Examole 3 :
         * Functional Chaining with andThen and Compose Methods.
         * */
        Function<Integer,Integer> f3 = n -> (n * 2);
        Function<Integer,Integer> f4 = n -> (n * n * n);
        System.out.println(f3.andThen(f4).apply(2)); //4  //64    calculate f3 then f4
        System.out.println(f3.compose(f4).apply(2)); //8  //16    calculate f4 then f3
    }
}
