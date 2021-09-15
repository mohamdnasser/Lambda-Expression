

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String args[]) {

        //ex1 : One Integer Parameter
        Predicate<Integer> p = i -> (i>10);
        System.out.println( p.test(5)); // false
        System.out.println( p.test(15)); // true


        //ex2 : One String Parameter
        Predicate<String> p1 = s -> (s.length() > 4);
        System.out.println(p1.test("Nasser")); // true


        //ex3 : print array element whose length < 5
        Predicate<String> p3 = str -> (str.length() > 5);
        String names[] = {"Muhammed" , "Nasser","Alex" , "cairo"};
        for (String name : names){
            if(p3.test(name)){
                System.out.println(name);
            }
        }
    }
}
