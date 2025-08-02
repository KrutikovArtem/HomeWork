package org.example.firstJavaClassAndObject;

public class Laptop {
    String brand;
    int price;

    public Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void printInfo() {
        System.out.println("Бренд: " + brand + " Цена: " + price + "руб");
    }
}
