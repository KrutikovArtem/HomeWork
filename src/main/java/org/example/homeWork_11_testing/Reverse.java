package org.example.homeWork_11_testing;

public class Reverse {

    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }
}
