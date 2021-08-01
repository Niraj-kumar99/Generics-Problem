package com.generics;

import java.util.Arrays;

public class FindMaxValue<T extends Comparable<T>> {
    T[] elements;

    public FindMaxValue(T[] elements) {
        this.elements = elements;
    }

    /*
     * Generic method to store values in array and return maximum value.
     *
     * @param elements.
     *
     */
    public static <T extends Comparable<T>> T maxOFValues(T[] elements) {
        Arrays.sort(elements);
        int lenght = elements.length;
        T max = elements[lenght - 1];
        System.out.printf("Max value is %s ", max);
        return max;
    }

    public static void main(String[] args) {

        Integer[] intMax = {1, 82, 5, 80, 4, 87, 100, 58};
        maxOFValues(intMax);
        System.out.println();

        Float[] floatMax = {1.6f, 87.8f, 82.8f, 80.2f, 4.8f};
        maxOFValues(floatMax);
        System.out.println();

        String[] stringMax = {"S", "A", "M"};
        maxOFValues(stringMax);
    }
}