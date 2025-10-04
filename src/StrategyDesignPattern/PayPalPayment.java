package StrategyDesignPattern;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("PayPal payment Processing");
    }
}
