package com.developer.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution1Test {

    /*it has to contain only alphanumerical characters (a−z, A−Z, 0−9);
    there should be an even number of letters;
    there should be an odd number of digits.
    You are given a string S consisting of N characters. String S can be divided into words by splitting it at, and removing, the spaces. The goal is to choose the longest word that is a valid password. You can assume that if there are K spaces in string S then there are exactly K + 1 words.

    For example, given "test 5 a0A pass007 ?xy1", there are five words and three of them are valid passwords: "5", "a0A" and "pass007". Thus the longest password is "pass007" and its length is 7. Note that neither "test" nor "?xy1" is a valid password, because "?" is not an alphanumerical character and "test" contains an even number of digits (zero).
*/

    @Test
    public void testEvenNumberLettersAndOddNumberDigits() {
        Solution1 solution = new Solution1();
        String input = "test1";
        int expected = 5;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testOddNumberLettersAndOddNumberDigits() {
        Solution1 solution = new Solution1();
        String input = "tests1";
        int expected = -1;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testEvenNumberLettersAndEvenNumberDigits() {
        Solution1 solution = new Solution1();
        String input = "test10";
        int expected = -1;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testJustEvenNumberLetters() {
        Solution1 solution = new Solution1();
        String input = "test";
        int expected = -1;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testJustOddNumberLetters() {
        Solution1 solution = new Solution1();
        String input = "tes";
        int expected = -1;
        assertEquals(expected, solution.solution(input));
    }


    @Test
    public void testCombinationWithOneSucess() {
        Solution1 solution = new Solution1();
        String input = "test 5 a0A pass007 ?xy1";
        int expected = 7;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testNoValidCombination() {
        Solution1 solution = new Solution1();
        String input = "test ?xy1 !a2b";
        int expected = -1;
        assertEquals(expected, solution.solution(input));
    }


    @Test
    public void testMultipleValidPasswords() {
        Solution1 solution = new Solution1();
        String input = "a0 pass123 b2b9c9c";
        int expected = 7;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testEdgeCaseEmptyString() {
        Solution1 solution = new Solution1();
        String input = "";
        int expected = -1;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testEdgeCaseSingleCharacter() {
        Solution1 solution = new Solution1();
        String input = "a";
        int expected = -1;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testEdgeCaseSingleValidCharacter() {
        Solution1 solution = new Solution1();
        String input = "1";
        int expected = 1;
        assertEquals(expected, solution.solution(input));
    }

    @Test
    public void testValidAndInvalidMix() {
        Solution1 solution = new Solution1();
        String input = "1a2b3C4d5e 12345 abcde ABCDE 1a2b3c";
        int expected = 5;
        assertEquals(expected, solution.solution(input));
    }

}