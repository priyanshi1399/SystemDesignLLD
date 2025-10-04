package StrategyDesignPattern;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("crypto Payment processing");
    }
}
