package org.example.homeWork_11_testing;

public class CountWords {

    public int countWords(String sentence) {
        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
    }
}
