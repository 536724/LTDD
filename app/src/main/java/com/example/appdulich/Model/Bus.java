package com.example.appdulich.Model;

public class Bus {
    private String city;
    private String desc;
    private double star;
    private long ordered;
    private long price;
    private int image;
    public Bus(String city, String desc, double star, long ordered, long price, int image) {
        this.city = city;
        this.desc = desc;
        this.star = star;
        this.ordered = ordered;
        this.price = price;
        this.image = image;
    }

    public Bus() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public long getOrdered() {
        return ordered;
    }

    public void setOrdered(long ordered) {
        this.ordered = ordered;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
