package org.example;

public class Laptop {
    String brand;
    int price;

    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setPrice(int newPrice) {
        this.price = newPrice;
    }

    String getBrand() {
        return brand;
    }

    int getPrice() {
        return price;
    }

    void printInfo() {
        System.out.println("Бренд: " + brand + " Цена: " + price + "руб");
    }
}
