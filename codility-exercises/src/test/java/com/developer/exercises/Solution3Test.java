package com.developer.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution3Test {


    @Test
    public void testsucess() {
        Solution2 solution = new Solution2();
        int[] A = new int[2];
        A[0] = 5;
        A[1] = 8;
        int expected = 0;
        assertEquals(expected, solution.solution(A));
    }

    @Test
    public void testThereIsWater() {
        Solution2 solution = new Solution2();
        int[] A = new int[3];
        A[0] = 9;
        A[1] = 8;
        A[2] = 9;
        int expected = 1;
        assertEquals(expected, solution.solution(A));
    }

    @Test
    public void testThereIsWater1() {
        Solution2 solution = new Solution2();
        int[] A = new int[3];
        A[0] = 9;
        A[1] = 8;
        A[2] = 10;
        int expected = 1;
        assertEquals(expected, solution.solution(A));
    }

    @Test
    public void testThereIsWater2() {
        Solution2 solution = new Solution2();
        int[] A = new int[3];
        A[0] = 10;
        A[1] = 8;
        A[2] = 10;
        int expected = 2;
        assertEquals(expected, solution.solution(A));
    }

}