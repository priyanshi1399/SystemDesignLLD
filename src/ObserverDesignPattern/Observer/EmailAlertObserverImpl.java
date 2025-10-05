package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId,StocksObservable stocksObservable){
        this.emailId=emailId;
        this.stocksObservable=stocksObservable;
    }
    @Override
    public void update() {
        sendEmail(emailId, "Hurry up order is in stock!");
    }

    private void sendEmail(String emailId,String msg){
        System.out.println("Email sent to : "+emailId);
    }
}
