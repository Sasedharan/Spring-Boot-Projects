package com.em.springboot.Entity;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sNo;
    private String itemName;
    private String brand;
    private int quantity;

    public Product(String itemName, String brand, int quantity) {
        this.itemName = itemName;
        this.brand = brand;
        this.quantity = quantity;
    }

    public Product() {

    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sNo=" + sNo +
                ", itemName='" + itemName + '\'' +
                ", brand='" + brand + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

