package com.developer;

import java.util.List;
// Descrição: Imprimir a lista de números pares 10,1,2,3,4,5,4,3,2,1,9

public class LambdaStreamFilterExample {
    public static void main(String[] args) {

        System.out.println("Ways to use stream and lambda!");
        List<Integer> numbers = List.of(10,1,2,3,4,5,4,3,2,1,9);
        System.out.println("***** 1 - For (Even list Structured! *****");
        printEvenNumericInListStructured(numbers);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 2 - Stream (Even list Funcional! *****");
        printEvenNumericInListFunctional(numbers);

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 3 - Stream With out print specif Class (Funcional! *****");
        printAllNumericInListFunctionalLambda(numbers);
    }

    private static boolean isEven(Integer number) {
       return number%2 == 0;
    }

    private static void print(Integer number) {
        System.out.print(number + " | ");
    }

    private static void printAllNumericInListFunctionalLambda(List<Integer> numbers) {
        numbers.stream().filter(number -> number%2 ==0) //LambdaExpression
                .forEach(LambdaStreamFilterExample::print);
    }

    private static void printEvenNumericInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(LambdaStreamFilterExample::isEven)
                .forEach(LambdaStreamFilterExample::print);
    }

    private static void printEvenNumericInListStructured(List<Integer> numbers) {
        for (int number:numbers){
            if (number%2==0){
                print(number);
            }

        }

    }
}