package StrategyDesignPattern;

public class StripePayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Stripe payment Processing");
    }
}
