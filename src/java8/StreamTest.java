package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(3, 2, 5, 4, 6, 3);

        /*//map function
        List incrementedList = number.stream().map(x->x+1).collect(Collectors.toList());
        System.out.println(incrementedList);
        //filter
        List filteredList = number.stream().filter(x->x%2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);
        //sort
        Set sortedList = number.stream().collect(Collectors.toSet());
        System.out.println(sortedList);
        //forEach
        number.stream().forEach(x-> System.out.println(x*2));*/

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(32, "KD"));
        empList.add(new Employee(26, "Junaid"));
        empList.add(new Employee(21, "Vaibhav"));
        empList.add(new Employee(20, "Anu"));

        List<Employee> ageIncrList = empList.stream().filter(e -> e.age>21).map(e -> new Employee(e.getAge()+2, e.getName())).
            collect(Collectors.toList());
//        ageIncrList.stream().forEach(x -> System.out.println(x.toString()));
        System.out.println(ageIncrList.toString());
    }
}

class Employee {
    int age;
    String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return "Employee{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}
