package org.example.homeWork_11_testing;

import java.util.Arrays;

public class FindMax {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
}
