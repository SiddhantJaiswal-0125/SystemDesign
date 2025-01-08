package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObserable;

public class MobileAlertObserver implements  NotificationAlertObserver{

    String userName;
    StockObserable stockObserable;

    public MobileAlertObserver(String userName, StockObserable stockObserable)
    {
        this.userName = userName;
        this.stockObserable = stockObserable;
    }
    @Override
    public void update() {
        sendMsgOnMobile(this.userName, "Product in Stock");
    }

    public void sendMsgOnMobile(String userName, String msg)
    {
        System.out.println("msg sent to username "+userName);
    }
}
