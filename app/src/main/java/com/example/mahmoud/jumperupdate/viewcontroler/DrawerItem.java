package com.example.mahmoud.jumperupdate.viewcontroler;

/**
 * Created by Mahmoud on 12/4/2015.
 */
public class DrawerItem {

    private int ItemID ;
    private String itemName;


    public DrawerItem(String name , int id){
        this.ItemID  = id;
        this.itemName = name;
    }
    public int getItemID() {
        return ItemID;
    }
    public void setItemID(int itemID) {
        ItemID = itemID;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

}
