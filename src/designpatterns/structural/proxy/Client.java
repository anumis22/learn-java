package designpatterns.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Banking bank = new CreditCard("anu");
        bank.debitMoney();
    }
}
