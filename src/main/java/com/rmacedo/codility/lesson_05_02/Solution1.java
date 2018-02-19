package com.rmacedo.codility.lesson_05_02;

public class Solution1 implements SolutionInterface {

    public static void main(String... args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution(new int[]{0, 1, 0, 1, 1}));
    }

    @Override
    public int solution(int[] A) {
        int factor = 0;
        int pairSum = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) factor++;
            else if (A[i] == 1) pairSum += factor;
        }

        if (pairSum > 1000000000) return -1;
        return pairSum;
    }
}
