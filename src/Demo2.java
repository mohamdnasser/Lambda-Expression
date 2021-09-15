import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    String name;
    int salary;
    int exp;

    public Employee(String name, int salary, int exp) {
        this.name = name;
        this.salary = salary;
        this.exp = exp;
    }
}

public class Demo2 {

    public static void main(String args[]) {

        // ex1:  Class Object (One Object) -- return employee name if the salary > 7000 and  exp > 3.
        Employee employee = new Employee("Nasser",8000,5);
        Predicate<Employee> p1 = e->(e.exp > 3 && e.salary > 7000);
        if(p1.test(employee)) {
            System.out.println(employee.name);
        }

        System.out.println("============================================================");

        // ex2:  Class Object (Multiple Objects) -- return employee name if the salary > 7000 and  exp > 3.
        List<Employee> list = new ArrayList();
        list.add(new Employee("Muhammed" ,4000 , 5 ));
        list.add(new Employee("Malek" ,8000 , 5 ));
        list.add(new Employee("Omar" ,10000 , 5 ));
        list.add(new Employee("Ahmed" ,2000 , 5 ));

        Predicate<Employee> p2 = emp->(emp.exp > 3 && emp.salary > 3000);

        for (Employee itr : list){
            if(p2.test(itr)){
                System.out.println(itr.name + " " + itr.salary);
            }
        }
    }
}
