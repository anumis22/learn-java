package practice;

import java.util.Objects;

public class HashCodeEquals {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Anu");
        Employee e2 = e1;
        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode() == e2.hashCode());
        System.out.println(e1==e2);
    }
}

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override public int hashCode() {
        return Objects.hash(id, name);
    }
}
