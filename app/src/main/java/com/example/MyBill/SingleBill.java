package com.example.MyBill;

import java.io.Serializable;
import  java.util.Date;

public class SingleBill implements Serializable {
    private Date date;
    private String locationStr;
    private float money;
    private String event;
    private String picPath;

    public SingleBill() {
        date = new Date();
        locationStr = "";
        money = 0;
        event = "";
        picPath = null;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date newDate) {
        date = newDate;
    }

    public String getLocation() { return locationStr; }
    public void setLocation(String newLocationStr) { locationStr = newLocationStr; }

    public float getMoney() {
        return money;
    }
    public void setMoney(float newMoney) { money = newMoney; }

    public String getEvent() { return event; }
    public void setEvent(String newEvent) { event = newEvent; }

    public String getPicPath() { return picPath; }
    public void setPicPath(String newPath) { picPath = newPath; }
}
