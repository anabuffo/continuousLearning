package com.developer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
// Descrição: Imprimir a lista de números pares 10,1,2,3,4,5,4,3,2,1,9

public class NumbersExercise {
    public static void main(String[] args) {

        System.out.println("Exercises with numbers!");
        List<Integer> numbers = List.of(1,2,3,4,5,4,3,2,1); //List.of(12,9,13,4,6,2,4,12,15);
        System.out.println ("\n ---------------------------------");
        System.out.println("***** 1 - Print all numbers! *****");
        printAllNumbers(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println("***** 2 - Print only even numbers! *****");
        printEvenNumbers(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println("***** 3 - Print only odd numbers! *****");
        printOnlyOddNumbers(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 4 - Print the cube of even numbers! *****");
        printCubeOfEvenNumbers(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 5 - Print the Square for every number *****");
        printSquareNumbers(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 6 - Print the sum of the square for every number *****");
        System.out.print("Option 1: ");
        printSumOfSquareNumbers(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.print("Option 2: ");
        printSumOfSquareNumbers2(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 7 - Print the sum of the cube for every number *****");
        System.out.print("Option 1: ");
        printSumOfCubeNumbers(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.print("Option 2: ");
        printSumOfCubeNumbers2(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 8 - Print the sum of the Odd numbers *****");
        printSumOfOddNumbers(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 9 - Print distinct numbers *****");
        printDistinctNumbers(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 10 - Print numbers sorted *****");
        printSortedNumbers(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 11 - Print numbers sorted Desc *****");
        printSortedDescNumbers(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 12 - Print the new collection with square values *****");
        setSquareNumberList(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 13 - Print the new collection with distinct and odd numbers values *****");
        setOddNumberList(numbers);
    }

    private static void print(Integer number) {
        System.out.print(number + " | ");
    }

    private static void printAllNumbers(List<Integer> numbers) {
        numbers.stream()
                .forEach(NumbersExercise::print);
    }


    private static void printEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number%2 ==0) //LambdaExpression
                .forEach(NumbersExercise::print);
    }

    private static void printOnlyOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2!=0) //Lambda Expression
                .forEach(NumbersExercise::print);
    }

    private static void printCubeOfEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number%2 ==0) //LambdaExpression
                .map(number -> number * number * number)
                .forEach(NumbersExercise::print);
    }

    private static void printSquareNumbers(List<Integer> numbers) {
        numbers.stream()
                .map(number -> number * number)
                .forEach(NumbersExercise::print);
    }

    private static void printSumOfSquareNumbers(List<Integer> numbers) {
        int sum = numbers.stream()
                .map(number -> number * number)
                .reduce(0, (x,y) -> x +y );
        print (sum);
    }

    private static void printSumOfSquareNumbers2(List<Integer> numbers) {
        int sum = numbers.stream()
                .map(number -> number * number)
                .reduce(0, Integer::sum);
        print (sum);
    }


    private static void printSumOfCubeNumbers(List<Integer> numbers) {
        int sum = numbers.stream()
                .map(number -> number * number * number)
                .reduce(0, (x,y) -> x +y );
        print (sum);
    }

    private static void printSumOfCubeNumbers2(List<Integer> numbers) {
        int sum = numbers.stream()
                .map(number -> number * number * number)
                .reduce(0, Integer::sum );
        print (sum);
    }

    private static void printSumOfOddNumbers(List<Integer> numbers) {
        int sum = numbers.stream().filter(number -> number%2!=0)
                .reduce(0, (x,y) -> x +y );
        print (sum);
    }

    private static void printDistinctNumbers(List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .forEach(NumbersExercise::print);
    }

    private static void printSortedNumbers(List<Integer> numbers) {
        numbers.stream()
                .sorted() //Comparator.naturalOrder()
                .forEach(NumbersExercise::print);
    }

    private static void printSortedDescNumbers(List<Integer> numbers) {
        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(NumbersExercise::print);
    }

    private static List<Integer> setSquareNumberList(List<Integer> numbers) {
        List<Integer> list =  numbers.stream().map(number -> number* number).collect(Collectors.toList());
        printAllNumbers(list);
        return list;
    }

    private static List<Integer> setOddNumberList(List<Integer> numbers) {
        List<Integer> list =  numbers.stream().filter(number -> number%2!=0).distinct().collect(Collectors.toList());
        printAllNumbers(list);
        return list;
    }
}