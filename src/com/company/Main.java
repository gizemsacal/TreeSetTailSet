package com.company;

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using tailSet() with default boolean value
        System.out.println("Boole değeri olmadan tailSet kullanma: " + numbers.tailSet(4));

        // Using tailSet() with specified boolean value
        System.out.println("Boole değeriyle tailSet kullanma: " + numbers.tailSet(4, false));
    }
}