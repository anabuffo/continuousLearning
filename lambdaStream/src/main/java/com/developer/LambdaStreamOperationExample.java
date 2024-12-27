package com.developer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
// Descrição: Imprimir a soma de números 10,1,2,3,4,5,4,3,2,1,9

public class LambdaStreamOperationExample {
    public static void main(String[] args) {

        System.out.println("Ways to use stream and lambda!");
        List<Integer> numbers = List.of(10,1,2,3,4,5,4,3,2,1,9);

        System.out.println("***** 1 - For - Sum Structured! *****");
        printSumNumericInListStructured(numbers);

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 2 - Stream - Sum Funcional! *****");
        printSumNumericInListFunctional(numbers);

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 3 - Stream Sum aggregate  - Funcional! *****");
        printSumNumericInListFunctionalMethodReference(numbers);

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 4 - Stream/Predicate/Function/Consumer  - Funcional! *****");
        printAdvancedStream1(numbers);

    }

    private static void print(Integer number) {
        System.out.print(number + " | ");
    }

    private static int sum (int a, int b){
        return a + b;
    }

    private static void printSumNumericInListFunctionalMethodReference(List<Integer> numbers) {
        int sum = numbers.stream().reduce(0, (x,y) -> x +y);//MethodReference
        print(sum);
    }

    private static void printSumNumericInListFunctional(List<Integer> numbers) {
        int sum = numbers.stream()
                         .reduce(0,LambdaStreamOperationExample::sum );
        print(sum);
    }

    private static void printSumNumericInListStructured(List<Integer> numbers) {
        int sum = 0;
        for (int number:numbers){
            sum += number;

        }
        print(sum);
    }

    private static void printAdvancedStream1(List<Integer> numbers) {
        numbers.stream()
                .filter(isEvenNumberPredicate())
                .map(SquareFunction())
                .forEach(printConsumer());
    }

    private static Consumer<Integer> printConsumer() {
        return LambdaStreamOperationExample::print;
    }

    private static Function<Integer, Integer> SquareFunction() {
        return number -> number * number;
    }

    private static Predicate<Integer> isEvenNumberPredicate() {
        return number -> number % 2 == 0;
    }
}