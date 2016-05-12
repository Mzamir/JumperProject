package com.example.mahmoud.jumperupdate.viewcontroler;

/**
 * Created by Mahmoud on 12/5/2015.
 */
public class UserItem {
    private String userImageURL ;
    private String userName;

    public UserItem(String userImageURL, String userName) {
        this.userImageURL = userImageURL;
        this.userName = userName;
    }

    public String getUserImageURL() {
        return userImageURL;
    }

    public void setUserImageURL(String userImageURL) {
        this.userImageURL = userImageURL;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
