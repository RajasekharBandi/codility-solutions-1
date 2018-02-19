package com.rmacedo.codility.lesson_05_03;

public class Solution1 implements SolutionInterface {

    public static void main(String... args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }

    @Override
    public int solution(int[] A) {
        double minAvgValue = (A[0] + A[1]) / 2.0;   // The mininal average
        int minAvgPos = 0;    // The begin position of the first
        // slice with mininal average

        for (int i = 0; i < A.length - 2; i++) {
            //Try the next 2 - element slice
            if ((A[i] + A[i + 1]) / 2.0 < minAvgValue) {
                minAvgValue = (A[i] + A[i + 1]) / 2.0;
                minAvgPos = i;
            }

            //Try the next 3 - element slice
            if ((A[i] + A[i + 1] + A[i + 2]) / 3.0 < minAvgValue) {
                minAvgValue = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
                minAvgPos = i;
            }

        }

        //try the last 2 - element slice
        if ((A[A.length - 1] + A[A.length - 2]) / 2.0 < minAvgValue) {
            minAvgValue = (A[A.length - 1] + A[A.length - 2]) / 2.0;
            minAvgPos = A.length - 2;
        }

        return minAvgPos;
    }
}
