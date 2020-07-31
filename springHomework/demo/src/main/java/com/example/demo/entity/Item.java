package com.example.demo.entity;

public class Item {
    private int Item_no;
    private String id;
    private String name;
    private int price;
    private String ex;

    public int getItemNo() { return Item_no; }
    public void setItemNo(int Item_no) { this.Item_no = Item_no; }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEx() { return ex; }

    public void setEx(String ex) { this.ex = ex; }
}
