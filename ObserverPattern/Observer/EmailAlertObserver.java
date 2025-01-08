package ObserverPattern.Observer;

import ObserverPattern.Observable.StockObserable;

public class EmailAlertObserver implements  NotificationAlertObserver{
    StockObserable stockObserable;
    String email;
    public EmailAlertObserver(String email, StockObserable stockObserable)
    {
        this.email = email;
        this.stockObserable = stockObserable;
    }

    public void sendEmail(String email, String msg)
    {
        System.out.println("Email Sent to : "+email);
    }
    @Override
    public void update() {
     sendEmail(email, "Product in Stock");
    }
}
