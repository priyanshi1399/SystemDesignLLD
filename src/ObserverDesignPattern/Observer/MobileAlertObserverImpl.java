package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String phoneNo;
    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String phoneNo,StocksObservable stocksObservable){
        this.phoneNo=phoneNo;
        this.stocksObservable=stocksObservable;
    }
    @Override
    public void update() {
        sendSMS(phoneNo, "product is in stock hurry up");
    }

    private void sendSMS(String phoneNo,String msg){
        System.out.println("SMS sent to : "+phoneNo);
    }
}
