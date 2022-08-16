package ObservableDesignPattern.Observable;

import ObservableDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservaleImple implements StockObservable{

    List<NotificationAlertObserver> list=new ArrayList<>();
    int stockcount=0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        list.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        list.remove(notificationAlertObserver);
    }

    @Override
    public void notigyuser() {
        for(NotificationAlertObserver observer:list){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newstock) {
        if(stockcount==0){
            notigyuser();
        }
        stockcount=stockcount+newstock;
    }

    @Override
    public int getStockCount() {
        return stockcount;
    }
}
