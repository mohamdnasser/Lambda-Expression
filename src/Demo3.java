import java.util.function.Predicate;

public class Demo3 {

    // Joining Predicates with (or,and) ... negate
    /*
    * Ex1:
    * p1 check for the even numbers.
    * p2 check if the number greater than 30.
    * */
    public static void main(String args[]) {

        Integer num[] = {5,10,15,20,25,30,35,40,45,50,55,65,70};
        Predicate<Integer> p1 = i -> (i % 2 == 0);
        Predicate<Integer> p2 = i -> (i > 30);

        // and
        for(Integer itr: num ){
            // and
            if(p1.and(p2).test(itr)){
                System.out.println(itr);
            }
        }

        System.out.println("==========================================");

        //or
        for(Integer itr: num ){
            // and
            if(p1.or(p2).test(itr)){
                System.out.println(itr);
            }
        }

        System.out.println("==========================================");

        // negate
        for(Integer itr: num ){
            // and
            if(p1.test(itr)){
                System.out.println(itr);
            }
        }

    }
}
