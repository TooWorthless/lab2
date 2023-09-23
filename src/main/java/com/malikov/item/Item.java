package com.malikov.item;

import java.util.UUID;


public abstract class Item {
    protected String title;
    protected String uniqueID;
    protected boolean isBorrowed;


    public Item(String title) {
        this.title = title;
        this.uniqueID = UUID.randomUUID().toString();
        isBorrowed = false;
    }


    public abstract void borrowItem();
    public abstract void returnItem();
}
