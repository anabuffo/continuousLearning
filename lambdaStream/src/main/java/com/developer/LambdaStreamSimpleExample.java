package com.developer;

import java.util.List;
// Descrição: Imprimir a lista de números 10,1,2,3,4,5,4,3,2,1,9

public class LambdaStreamSimpleExample {
    public static void main(String[] args) {

        System.out.println("Ways to use stream and lambda!");
        List<Integer> numbers = List.of(10,1,2,3,4,5,4,3,2,1,9);

        System.out.println("***** 1 - For (list Structured! *****");
        printAllNumericInListStructured(numbers);

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 2 - Stream (Funcional! *****");
        printAllNumericInListFunctional(numbers);

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 3 - Stream With out print specif Class (Funcional! *****");
        printAllNumericInListFunctionalMethodReference(numbers);

    }

    private static void print(Integer number) {
        System.out.print(number + " | ");
    }

    private static void printAllNumericInListFunctionalMethodReference(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println ); //MethodReference
    }

    private static void printAllNumericInListFunctional(List<Integer> numbers) {
        numbers.stream().forEach(LambdaStreamSimpleExample::print);
    }

    private static void printAllNumericInListStructured(List<Integer> numbers) {
        for (int number:numbers){
            print(number);
        }

    }
}