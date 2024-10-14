package com.example.appdulich.Model;

public class Ticket {
    private int image;
    private String name;
    private double rate;
    private long view;
    private double price;

    public Ticket() {
    }

    public Ticket(int image, String name, double rate, long view, double price) {
        this.image = image;
        this.name = name;
        this.rate = rate;
        this.view = view;
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
