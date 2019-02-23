package com.bibendum.bluehacks.bibendum;

import java.util.Date;

public class Item {
    private String itemName;
    private Date dateReceived;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

}
