package org.example.firstJavaClassAndObject;

public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    public int getPrice() {
        return price;
    }

    public void applyDiscount(int discount) {
        price = price * discount / 100;

    }

    public void printInfo() {
        System.out.println("Название: " + name + " Цена: " + price);
    }
}
