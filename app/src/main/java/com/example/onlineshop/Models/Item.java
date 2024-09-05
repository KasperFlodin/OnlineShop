package com.example.onlineshop.Models;

import java.io.Serializable;

public class Item implements Serializable {
    int id;
    String name;
    String description;
    int price;
    String obejctImage;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getObejctImage() {
        return obejctImage;
    }

    public void setObejctImage(String obejctImage) {
        this.obejctImage = obejctImage;
    }
}
