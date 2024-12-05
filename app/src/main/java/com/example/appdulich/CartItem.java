package com.example.appdulich;


public class CartItem {
    private int imageResId;
    private String title;
    private String details;
    private String price;
    private String voucher;
    private String discount;
    private boolean selected; // Thêm thuộc tính selected

    public CartItem(int imageResId, String title, String details, String price, String voucher, String discount) {
        this.imageResId = imageResId;
        this.title = title;
        this.details = details;
        this.price = price;
        this.voucher = voucher;
        this.discount = discount;
        this.selected = false; // Mặc định là chưa chọn
    }

    // Getter và setter
    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

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
