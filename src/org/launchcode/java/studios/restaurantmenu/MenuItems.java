package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;

public class MenuItems {
    private String description;
    private double price;
    private String category;
    private String name;
    private boolean newItem = true;
    private Date dateAdded;

    public MenuItems(String description, double price, String category, String name, boolean isNew){
        this.description = description;
        this.price = price;
        this.category = category;
        this.name = name;
        this.newItem = isNew;
        this.dateAdded = new Date();
    }
}
