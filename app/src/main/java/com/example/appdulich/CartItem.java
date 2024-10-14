package com.example.appdulich;


public class CartItem {
    private int imageResId;
    private String title;
    private String details;
    private String price;
    private String voucher;
    private String discount;

    public CartItem(int imageResId, String title, String details, String price, String voucher, String discount) {
        this.imageResId = imageResId;
        this.title = title;
        this.details = details;
        this.price = price;
        this.voucher = voucher;
        this.discount = discount;
    }

    // Getter methods
    public int getImageResId() {
        return imageResId;
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

    public String getVoucher() {
        return voucher;
    }

    public String getDiscount() {
        return discount;
    }
}
