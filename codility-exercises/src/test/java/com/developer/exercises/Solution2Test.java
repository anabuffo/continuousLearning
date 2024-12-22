package com.developer.exercises;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution2Test {


    @Test
    public void testTwoSpaces() {
        Solution2 solution = new Solution2();
        int[] A = new int[2];
        A[0] = 5;
        A[1] = 8;
        int expected = 0;
        assertEquals(expected, solution.solution(A));
    }

    @Test
    public void testThreeSpacesWithWater1() {
        Solution2 solution = new Solution2();
        int[] A = new int[3];
        A[0] = 9;
        A[1] = 8;
        A[2] = 9;
        int expected = 1;
        assertEquals(expected, solution.solution(A));
    }

    @Test
    public void testThreeSpacesWithWater2() {
        Solution2 solution = new Solution2();
        int[] A = new int[3];
        A[0] = 9;
        A[1] = 8;
        A[2] = 10;
        int expected = 1;
        assertEquals(expected, solution.solution(A));
    }

    @Test
    public void testThreeSpacesWithWater3() {
        Solution2 solution = new Solution2();
        int[] A = new int[3];
        A[0] = 10;
        A[1] = 8;
        A[2] = 10;
        int expected = 2;
        assertEquals(expected, solution.solution(A));
    }

    @Test
    public void testThreeSpacesWithoutWater() {
        Solution2 solution = new Solution2();
        int[] A = new int[3];
        A[0] = 8;
        A[1] = 10;
        A[2] = 9;
        int expected = 0;
        assertEquals(expected, solution.solution(A));
    }

    @Test
    public void testSixSpacewithWater() {
        Solution2 solution = new Solution2();
        int[] A = new int[6];
        A[0] = 10;
        A[1] = 8;
        A[2] = 15;
        A[3] = 10;
        A[4] = 15;
        A[5] = 11;
        int expected = 5;
        assertEquals(expected, solution.solution(A));
    }

}