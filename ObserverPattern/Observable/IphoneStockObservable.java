package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertObserver;
import java.util.*;

public class IphoneStockObservable implements  StockObserable{
    int stockCount;
    List<NotificationAlertObserver> observers;
    public IphoneStockObservable(int cnt)
    {
        stockCount = cnt;
        observers = new ArrayList<>();
    }

    @Override
    public void add(NotificationAlertObserver obj) {
        observers.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {

        observers.remove(obj);
    }

    @Override
    public void notifySuscribers() {
        for( NotificationAlertObserver nt : observers)
            nt.update();
    }

    @Override
    public void setStockCount(int newStockCount) {
        stockCount = newStockCount;
        notifySuscribers();
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
