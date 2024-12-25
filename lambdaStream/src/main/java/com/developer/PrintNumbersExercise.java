package com.developer;

import java.util.List;
// Descrição: Imprimir a lista de números pares 10,1,2,3,4,5,4,3,2,1,9

public class PrintNumbersExercise {
    public static void main(String[] args) {

        System.out.println("Ways to use stream and lambda!");
        List<Integer> numbers = List.of(10,1,2,3,4,5,4,3,2,1,9);
        System.out.println("***** 1 - Print Even Numbers! *****");
        printEvenNumbers(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 2 - Print the cube of even numbers! *****");
        printCubeOfEvenNumbers(numbers);

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 3 - Stream With out print specif Class (Funcional! *****");

    }

    private static void print(Integer number) {
        System.out.print(number + " | ");
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number%2 ==0) //LambdaExpression
                .forEach(PrintNumbersExercise::print);
    }

    private static void printCubeOfEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number%2 ==0) //LambdaExpression
                .map(number -> number * number * number)
                .forEach(PrintNumbersExercise::print);
    }
}