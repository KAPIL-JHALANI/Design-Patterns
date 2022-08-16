package ObservableDesignPattern.Observable;

import ObservableDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver notificationAlertObserver);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notigyuser();
    public void setStockCount(int newstock);
    public int getStockCount();
}
