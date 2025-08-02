package org.example;

public class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void setPrice(int newPrice) {
        this.price = newPrice;
    }

    int getPrice() {
        return price;
    }

    void applyDiscount(int discount) {
        price = price * discount / 100;

    }

    void printInfo() {
        System.out.println("Название: " + name + " Цена: " + price);
    }
}
