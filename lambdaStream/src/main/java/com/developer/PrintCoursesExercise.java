package com.developer;


import java.util.List;

public class PrintCoursesExercise {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "PHP", "AWS", "Azure", "K8s", "Python", "Node");
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 1 - Print all courses *****");
        printAllList (courses);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 2 - Print just specific Course *****");
        printSpecific(courses, "Spring");
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 3 - Print Course has more than 4 chars *****");
        printSpecificWithSize(courses, 4);
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 4 - Print qtd of char per course *****");
        printCourseSize(courses);
    }

    private static void printAllList(List<String> list) {
        list.stream()
                .forEach(PrintCoursesExercise::print);
    }

    private static void printSpecific(List<String> lists, String filter) {
        lists.stream()
                .filter(list -> list.contains(filter))
                .forEach(PrintCoursesExercise::print);
    }
    private static void printSpecificWithSize(List<String> lists, Integer filter) {
        lists.stream()
                .filter(list -> list.length() >=filter)
                .forEach(PrintCoursesExercise::print);
    }

    private static void printCourseSize(List<String> lists) {
//        lists.stream()
//                .map(String::length)
//                .forEach(size -> print(size.toString()));
        lists.stream()
                .map(list -> list.length())
                .forEach(size -> print(size.toString()));
    }

    private static void print(String course) {
        System.out.print(course + " | ");
    }
}
