package com.developer;


import java.util.List;

public class OddNumberExercise {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        printOnlyOddNumbers (numbers);
    }

    private static void printOnlyOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2!=0) //Lambda Expression
                .forEach(OddNumberExercise::print);
    }

    private static void print(Integer number) {
        System.out.print(number + " | ");
    }
}
