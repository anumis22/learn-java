package basics;

abstract public class Employee {
    protected abstract double getAmt();

}

class Sales extends Employee {

    @Override
    public double getAmt() {
        return 0;
    }
}
