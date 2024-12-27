package com.developer;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
// Descrição: Imprimir a lista de números pares 10,1,2,3,4,5,4,3,2,1,9

public class NumbersBehaviorParameterizationExercise {
    public static void main(String[] args) {

        System.out.println("Exercises with numbers!");
        List<Integer> numbers = List.of(-2,1,2,3,4,5,4,3,2,1); //List.of(12,9,13,4,6,2,4,12,15);
        System.out.println ("\n ---------------------------------");
        System.out.println("***** 1 - Print all positive numbers! *****");
        filterAndPrint(numbers, x -> x>0);
        System.out.println ("\n ---------------------------------");
        System.out.println("***** 2 - Print only even numbers! *****");
        filterAndPrint(numbers, x -> x%2==0);
        System.out.println ("\n ---------------------------------");
        System.out.println("***** 3 - Print only odd numbers! *****");
        filterAndPrint(numbers, x -> x%2!=0);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 4 - Print the cube of numbers! *****");
        List<Integer> cubedNumbers =  mapAndCreateNewList(numbers, x -> x*x*x);
        cubedNumbers.stream().forEach(NumbersBehaviorParameterizationExercise::print);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 5 - Print the Square of number *****");
        List<Integer> squaredNumbers =  mapAndCreateNewList(numbers,  x -> x*x);
        System.out.println(squaredNumbers);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 6 - Print the x + x *****");
        List<Integer> doubledNumbers =  mapAndCreateNewList(numbers, x -> x + x);
        System.out.println(doubledNumbers);
    }

    private static void print(Integer number) {
        System.out.print(number + " | ");
    }

    private static List<Integer> mapAndCreateNewList(List<Integer> numbers,
                                                     Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(NumbersBehaviorParameterizationExercise::print);
    }
}