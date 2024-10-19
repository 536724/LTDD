package com.example.appdulich.Model;

public class Search {
    private int image;
    private String name;
    private String address;
    private double price;

    public Search() {
    }

    public Search(int image, String name, String address, double price) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
