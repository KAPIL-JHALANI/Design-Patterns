import ObservableDesignPattern.Observable.IphoneObservaleImple;
import ObservableDesignPattern.Observable.StockObservable;
import ObservableDesignPattern.Observer.EmailAlertObserverImple;
import ObservableDesignPattern.Observer.MobileAlertObservaleImple;
import ObservableDesignPattern.Observer.NotificationAlertObserver;

public class Pattern {
    public static void main(String[]args){

        StockObservable iphone=new IphoneObservaleImple();
        NotificationAlertObserver observer=new EmailAlertObserverImple("jhalani@gmail.com",iphone);
        NotificationAlertObserver observer1=new MobileAlertObservaleImple("kapil",iphone);
        NotificationAlertObserver observer2=new EmailAlertObserverImple("jhalani@gmail.com",iphone);

        iphone.add(observer);
        iphone.add(observer1);
        iphone.add(observer2);

        iphone.setStockCount(10);

    }
}
