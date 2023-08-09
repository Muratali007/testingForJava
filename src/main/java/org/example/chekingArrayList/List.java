package org.example.chekingArrayList;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            numbers.add(i);
        }

        long startTime = System.currentTimeMillis();
        for (Integer x : numbers) {
            System.out.println(x);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        long endTime1 = System.currentTimeMillis();
        long totalTime1 = endTime1 - startTime1;

        System.out.println("time for for each: " + totalTime);
        System.out.println("time for default for: "  + totalTime1);
    }
}
