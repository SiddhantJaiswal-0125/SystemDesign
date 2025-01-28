package org.example;

//import ObserverPattern.Observable.IphoneStockObservable;
//import ObserverPattern.Observable.StockObserable;
//import ObserverPattern.Observer.EmailAlertObserver;
//import ObserverPattern.Observer.MobileAlertObserver;
//import ObserverPattern.Observer.NotificationAlertObserver;
import org.apache.commons.collections4.SetUtils;
import org.apache.commons.lang3.StringUtils;

import  java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
//    public static void main2(String[] args) {
//        StockObserable iphoneStockObserverable = new IphoneStockObservable(10);
//        NotificationAlertObserver observer1 = new EmailAlertObserver("sid@gmail.com", iphoneStockObserverable);
//        NotificationAlertObserver observer2 = new EmailAlertObserver("testing2@gmail.com", iphoneStockObserverable);
//        NotificationAlertObserver observer3 = new MobileAlertObserver("MobileUsername", iphoneStockObserverable);
//
//        iphoneStockObserverable.add(observer1);
//        iphoneStockObserverable.add(observer2);
//        iphoneStockObserverable.add(observer3);
//
//        iphoneStockObserverable.setStockCount(15);
//
//
//
//
//
//    }


    private  transient Map<String, String> resolvedCachedSecrets = new ConcurrentHashMap<>();
    public static void main(String[] args) {
        impl obj1 = new impl() {
                @Override
            public int getval() {
                return 0;
            }
        };








    }





    private void method1(List<String> secretIdentifiers)
    {
        resolvedCachedSecrets.put("Key1", "dafa");
        resolvedCachedSecrets.put("Key2", "4rqrf");
//        resolvedCachedSecrets.put("Key3",nullpass);
//        resolvedCachedSecrets = null;
        new Main().resolveVaultSecrets(secretIdentifiers);
    }



    private Map<String, String> resolveVaultSecrets(List<String> secretIdentifiers) {

        boolean useCache =true;

        Set<String> sett = new HashSet<>(secretIdentifiers);
        Set<String> ans = SetUtils.difference(new HashSet<>(secretIdentifiers), resolvedCachedSecrets.keySet());
        System.out.println("ANS "+ans);

        System.out.println("USE CACHE "+useCache);


    return  null;
    }
}