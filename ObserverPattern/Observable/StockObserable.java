package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObserable {
    public void add(NotificationAlertObserver obj);

    public void remove(NotificationAlertObserver obj);

    public void notifySuscribers();

    public void setStockCount(int newStockCount);

    public int getStockCount();
}
