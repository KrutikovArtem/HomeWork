package org.example.homeWork_5.dish;

public class Main {
    public static void main(String[] args) {

        HotDish hotDish = new HotDish();
        Drink drink = new Drink();

        Menu menu = new Menu();

        menu.setDish(drink);
        menu.setDish(hotDish);

        menu.printMenu(drink);
        menu.printMenu(hotDish);
    }
}
