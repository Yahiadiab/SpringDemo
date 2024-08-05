package com.example.demo.model;

public class Item {

    private int ItemId;
    private String ItemName;
    private String ItemCode;



    public Item() {
    }


    public Item(int id, String name, String code) {
        this.ItemId = id;
        this.ItemName = name;
        this.ItemCode = code;
    }


    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int itemId) {
        this.ItemId = itemId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        this.ItemName = itemName;
    }

    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String itemCode) {
        this.ItemCode = itemCode;
    }







}
