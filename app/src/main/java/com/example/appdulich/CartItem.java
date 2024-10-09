package com.example.appdulich;

public class CartItem {
    private String title;
    private String details;
    private String price;
    private String discount;
    private String voucher;
    private int imageResId;

    public CartItem(String title, String details, String price, String discount, String voucher, int imageResId) {
        this.title = title;
        this.details = details;
        this.price = price;
        this.discount = discount;
        this.voucher = voucher;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public String getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }

    public String getVoucher() {
        return voucher;
    }

    public int getImageResId() {
        return imageResId;
    }
}

