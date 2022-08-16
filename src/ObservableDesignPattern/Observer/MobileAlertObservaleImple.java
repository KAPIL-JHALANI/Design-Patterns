package ObservableDesignPattern.Observer;

import ObservableDesignPattern.Observable.StockObservable;

public class MobileAlertObservaleImple implements NotificationAlertObserver{

    String email;
    StockObservable observable;

    public MobileAlertObservaleImple(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(email,"Hey new stock is added pleaase buy");
    }

    public void sendEmail(String email,String status){
        System.out.println(email+ "  "+status);
    }
}
