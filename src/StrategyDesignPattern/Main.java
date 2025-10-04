package StrategyDesignPattern;

public class Main {

    public static void main(String[] args) {
        PaymentStrategy creditCard=new CreditCardPayment();
        PaymentStrategy paypal=new PayPalPayment();
        PaymentStrategy crypto=new CryptoPayment();
        PaymentStrategy stripe=new StripePayment();

        PaymentProcessor processor=new PaymentProcessor(creditCard); //credit card payment strategy
        processor.processPayment();

        processor.setPaymentStrategy(crypto); //change dynamically to  crypto at runtime
        processor.processPayment();

        processor.setPaymentStrategy(stripe);
        processor.processPayment();
    }

}
