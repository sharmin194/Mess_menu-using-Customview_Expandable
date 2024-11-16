package com.sharmin.customview_expandable;



public class FoodItem {
    private String name;
    private String description;
    private int imageResourceId;

    public FoodItem(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
