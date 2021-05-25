package designpatterns.structural.proxy;

public class CreditCard implements Banking {
    private String accHolderName;
    private BankAccount account;

    public CreditCard(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    @Override public void debitMoney() {
        if(validateUser(accHolderName)){
            account = new BankAccount(accHolderName);
            account.debitMoney();
        } else {
            System.out.println("Invalid user");
        }
    }

    public boolean validateUser(String name){
        //vlidate user
        return false;
    }
}
