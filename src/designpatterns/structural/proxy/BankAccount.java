package designpatterns.structural.proxy;

public class BankAccount implements Banking {
    private String accHolderName;

    public BankAccount(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    @Override public void debitMoney() {
        System.out.println("Amount debited");
    }
}
