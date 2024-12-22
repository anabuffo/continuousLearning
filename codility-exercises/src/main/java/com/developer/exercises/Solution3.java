package com.developer.exercises;

/*
In this problem we consider unsigned 30-bit integers, i.e. all integers B such that 0 ≤ B < 2³⁰.
We say that integer A conforms to integer B if, in all positions where B has bits set to 1, A has corresponding bits set to 1.
For example:
00 0000 1111 0111 1101 1110 0000 1111(BIN) = 16,244,239 conforms to
00 0000 1100 0110 1101 1110 0000 0001(BIN) = 13,032,961, but
11 0000 1101 0111 0000 1010 0000 0101(BIN) = 819,399,173 does not conform to
00 0000 1001 0110 0011 0011 0000 1111(BIN) = 9,843,471.
Write a function:
class Solution { public int solution(int A, int B, int C); }
that, given three unsigned 30-bit integers A, B and C, returns the number of unsigned 30-bit integers conforming to at least one of the given integers.
For example, for integers:

A = 11 1111 1111 1111 1111 1111 1001 1111(BIN) = 1,073,741,727,
B = 11 1111 1111 1111 1111 1111 0011 1111(BIN) = 1,073,741,631, and
C = 11 1111 1111 1111 1111 1111 0110 1111(BIN) = 1,073,741,679,
the function should return 8, since there are 8 unsigned 30-bit integers conforming to A, B or C, namely:

11 1111 1111 1111 1111 1111 0011 1111(BIN) = 1,073,741,631,
11 1111 1111 1111 1111 1111 0110 1111(BIN) = 1,073,741,679,
11 1111 1111 1111 1111 1111 0111 1111(BIN) = 1,073,741,695,
11 1111 1111 1111 1111 1111 1001 1111(BIN) = 1,073,741,727,
11 1111 1111 1111 1111 1111 1011 1111(BIN) = 1,073,741,759,
11 1111 1111 1111 1111 1111 1101 1111(BIN) = 1,073,741,791,
11 1111 1111 1111 1111 1111 1110 1111(BIN) = 1,073,741,807,
11 1111 1111 1111 1111 1111 1111 1111(BIN) = 1,073,741,823.
Write an efficient algorithm for the following assumptions:

A, B and C are integers within the range [0..1,073,741,823].
*/

public class Solution3 {

    // This method takes three integer 'A', 'B' & 'C' as parameters and returning as integer as it calculates the number of conforming integers based on bitwise operations
    public static int solution(int A, int B, int C) {
        // Here, the number of conforming integers for the combinations of 'A|B', 'A|C', 'B|C', and 'A|B|C' are calculated. The common set bits among 'A', 'B', and 'C' are then subtracted once.
        int common = countConformingIntegers(A | B) + countConformingIntegers(A | C) + countConformingIntegers(B | C) - 1 * countConformingIntegers(A | B | C);

        // The total number of conforming integers for 'A', 'B', and 'C' is calculated, and the common set bits among 'A', 'B', and 'C' are subtracted once.
        return countConformingIntegers(A) + countConformingIntegers(B) + countConformingIntegers(C) - 1 * common;
    }

    public static int zeros(int N) {
        // This variable will be used to keep count of the bits in the binary representation of 'N'
        int conformingIntegers = 0;

        for (int i = 0; i < 30; i++) {
            // Checks if the least significant bit is '0' and if so it is increased by 1
            if (N % 2 == 0) {
                conformingIntegers++;
            }
            N >>= 1;    // The value of 'N' is right-shifted by '1' effectively moving to the next bit
        }
        return conformingIntegers;    // The method returns the count of zero bits in the binary representation of integer 'N'
    }

    // This method takes integer 'N' as a parameter and returns '2^zeros(N)'
    public static int countConformingIntegers(int N) {
        return 1 << zeros(N);    // This line uses the left-shift operator to calculate '2^zeros(N)'
    }

}
