package com.example.mahmoud.jumperupdate.viewcontroler;

/**
 * Created by Mahmoud on 12/4/2015.
 */
public class NotificationItem {
    public String userImageURL , notifyContent , companyName;

    public NotificationItem(){
        super();
    }

    public NotificationItem(String userImageURL, String notifyContent, String companyName) {
        this.userImageURL = userImageURL;
        this.notifyContent = notifyContent;
        this.companyName = companyName;
    }
}
