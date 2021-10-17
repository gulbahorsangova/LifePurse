package com.example.lifepurse.model;

public class Categories {
    private long CategoryId;
    private String CategoryLogo;
    private String CategoryName;



    public long getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(long categoryId) {
        CategoryId = categoryId;
    }

    public String getCategoryLogo() {
        return CategoryLogo;
    }

    public void setCategoryLogo(String categoryLogo) {
        CategoryLogo = categoryLogo;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
}
