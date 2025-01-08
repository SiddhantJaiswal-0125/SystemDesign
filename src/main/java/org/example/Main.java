package org.example;

import ObserverPattern.Observable.IphoneStockObservable;
import ObserverPattern.Observable.StockObserable;
import ObserverPattern.Observer.EmailAlertObserver;
import ObserverPattern.Observer.MobileAlertObserver;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObserable iphoneStockObserverable = new IphoneStockObservable(10);
        NotificationAlertObserver observer1 = new EmailAlertObserver("sid@gmail.com", iphoneStockObserverable);
        NotificationAlertObserver observer2 = new EmailAlertObserver("testing2@gmail.com", iphoneStockObserverable);
        NotificationAlertObserver observer3 = new MobileAlertObserver("MobileUsername", iphoneStockObserverable);

        iphoneStockObserverable.add(observer1);
        iphoneStockObserverable.add(observer2);
        iphoneStockObserverable.add(observer3);

        iphoneStockObserverable.setStockCount(15);





    }
}