package StrategyDesignPattern;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("CreditCard payment processing");
    }
}
