package com.example.mahmoud.jumperupdate.viewcontroler;

/**
 * Created by Mahmoud on 12/4/2015.
 */
public class Trips {
    public String companyName, tripName,tripDate,tripImage;

    public Trips(){
        super();
    }

    public Trips(String tripImage, String tripName, String companyName , String tripDate ) {

        this.tripImage = tripImage;
        this.companyName= companyName;
        this.tripName= tripName;
        this.tripDate= tripDate;

    }
}
