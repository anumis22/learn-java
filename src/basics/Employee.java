package basics;

abstract public class Employee {

    public Employee() {
    }

    protected abstract double getAmt();

}

class Sales extends Employee {

    @Override
    public double getAmt() {
        return 0;
    }

    public static void main(String[] args) {
        Employee e= new Sales();
    }
}
