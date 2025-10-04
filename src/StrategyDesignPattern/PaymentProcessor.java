package StrategyDesignPattern;

public class PaymentProcessor {

    PaymentStrategy paymentstrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategyObj){
        this.paymentstrategy=paymentStrategyObj;
    }

    //use the current strategy

    public void processPayment(){
        paymentstrategy.processPayment(); //Delegate the Payment strategy to its strategy
    }

    //dynamically  change strategy at the runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategyObj){
        this.paymentstrategy=paymentStrategyObj;
    }




}
