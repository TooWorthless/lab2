package com.malikov.interfaces;

import com.malikov.item.Item;


public interface IManageable {
    void add(Item item);
    void remove(Item item);
    void listAvailable();
    void listBorrowed();
}
