package com.developer;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        super();
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String toString() {
        return name + ":" + noOfStudents + ":" + reviewScore;
    }

}

public class CoursesCustomExercise {
    public static void main(String[] args) {
        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));

        // allMatch, noneMatch, anyMatch
        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 1 - Review Score Greater Than 95 - Predicate (boolean) // allMatch *****");
        Predicate<Course> reviewScoreGreaterThan95Predicate
                = course -> course.getReviewScore() > 95;
        System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 2 - Review Score Greater Than 95 - Predicate (boolean) // anyMatch *****");
        System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan95Predicate));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 3 - Review Score Greater Than 90 - Predicate (boolean) // anyMatch *****");
        Predicate<Course> reviewScoreGreaterThan90Predicate
                = course -> course.getReviewScore() > 90;
        System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan90Predicate));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 4 - Review Score Less Than 90 - Predicate (boolean) // noneMatch *****");
        Predicate<Course> reviewScoreLessThan90Predicate
                = course -> course.getReviewScore() < 90;
        System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 5 - Print courses sorted(ASC) by NoOfStudentsIncreasing *****");
        Comparator<Course> comparingByNoOfStudentsIncreasing
                = Comparator.comparingInt(Course::getNoOfStudents);
        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsIncreasing)
                        .collect(Collectors.toList()));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 6 - Print courses sorted(DESC) by NoOfStudentsIncreasing *****");
        Comparator<Course> comparingByNoOfStudentsDecreasing
                = Comparator.comparingInt(Course::getNoOfStudents).reversed();
        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsDecreasing)
                        .collect(Collectors.toList()));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 7 - Print courses sorted(DESC) by NoOfStudentsIncreasing And NoOfReviews  *****");
        Comparator<Course> comparingByNoOfStudentsAndNoOfReviews
                = Comparator.comparingInt(Course::getNoOfStudents)
                .thenComparingInt(Course::getReviewScore)
                .reversed();
        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsAndNoOfReviews)
                        .collect(Collectors.toList()));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 8 - Print courses sorted(DESC) by NoOfStudentsIncreasing And NoOfReviews - Limit 5 *****");
        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsAndNoOfReviews)
                        .limit(5)
                        .collect(Collectors.toList()));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 9 - Print courses sorted(DESC) by NoOfStudentsIncreasing And NoOfReviews - Skip first 3 courses *****");
        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsAndNoOfReviews)
                        .skip(3)
                        .collect(Collectors.toList()));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 10 - Print courses sorted(DESC) by NoOfStudentsIncreasing And NoOfReviews - Skip first 3 courses and limit 5 *****");
        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsAndNoOfReviews)
                        .skip(3)
                        .limit(5)
                        .collect(Collectors.toList()));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 11 - Print all courses  *****");
        System.out.println(courses);

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 12 - Print courses with Score greater than 95 (takeWhile) *****");
        System.out.println(
                courses.stream()
                        .takeWhile(course -> course.getReviewScore()>=95)
                        .collect(Collectors.toList()));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 13 - Print courses with Score less than 95 (dropWhile)  *****");
        System.out.println(
                courses.stream()
                        .dropWhile(course -> course.getReviewScore()>=95)
                        .collect(Collectors.toList()));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 14 - Print course NoOfStudentsAndNoOfReviews  *****");
        System.out.println(
                courses.stream()
                        .max(comparingByNoOfStudentsAndNoOfReviews));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 15 - Print course NoOfStudentsAndNoOfReviews  *****");
        System.out.println(
                courses.stream()
                        .min(comparingByNoOfStudentsAndNoOfReviews)
                        .orElse(new Course("Kubernetes", "Cloud", 91, 20000))
        );

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 16 - Print course reviewScoreLessThan90Predicate Or Else K8s *****");
        System.out.println(
                courses.stream()
                        .filter(reviewScoreLessThan90Predicate)
                        .min(comparingByNoOfStudentsAndNoOfReviews)
                        .orElse(new Course("Kubernetes", "Cloud", 91, 20000))
        );

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 17 - Print course reviewScoreLessThan90Predicate *****");
        System.out.println(
                courses.stream()
                        .filter(reviewScoreLessThan90Predicate)
                        .findFirst()
        );

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 18 - Print course reviewScoreGreaterThan95Predicate - First *****");
        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan95Predicate)
                        .findFirst()
        );

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 19 - Print course reviewScoreGreaterThan95Predicate - First *****");
        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan95Predicate)
                        .findAny()
        );

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 20 - Print course reviewScoreGreaterThan95Predicate - Sum NoOfStudents *****");
        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan95Predicate)
                        .mapToInt(Course::getNoOfStudents)
                        .sum());

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 21 - Print course reviewScoreGreaterThan95Predicate - average NoOfStudents *****");
        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan95Predicate)
                        .mapToInt(Course::getNoOfStudents)
                        .average());

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 22 - Print course reviewScoreGreaterThan95Predicate - count NoOfStudents *****");
        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan95Predicate)
                        .mapToInt(Course::getNoOfStudents)
                        .count());

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 23 - Print course reviewScoreGreaterThan95Predicate - max NoOfStudents *****");
        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan95Predicate)
                        .mapToInt(Course::getNoOfStudents)
                        .max());//OptionalInt[25000]

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 24 - Print complete courses info by category *****");
        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory)));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 25 - Print qtd of courses by category *****");
        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 26 - Print max reviewScore per category *****");
        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,
                                Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));

        System.out.println ("\n ---------------------------------");
        System.out.println ("***** 27 - Print courses name per category *****");
        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory,
                                Collectors.mapping(Course::getName, Collectors.toList()))));

    }

}
