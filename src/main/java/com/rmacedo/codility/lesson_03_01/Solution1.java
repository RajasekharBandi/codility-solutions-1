package com.rmacedo.codility.lesson_03_01;

public class Solution1 implements SolutionInterface {

    public static void main(String... args) {
        Solution1 s = new Solution1();

        System.out.println(s.solution(new int[]{3, 1, 2, 4, 3}));
        System.out.println(s.solution(new int[]{-1000, 1000}));

    }

    @Override
    public int solution(int[] A) {
        int minSum = Integer.MAX_VALUE;

        for (int p = 0; p < A.length; p++) {
            int first = 0;
            int last = 0;
            for (int i = 0; i < A.length; i++) {
                if (i <= p) first += A[i];
                else last += A[i];
            }
            int sum = Math.abs(first - last) > 0 ? Math.abs(first - last) : minSum;
            if (sum < minSum) minSum = sum;

        }

        return minSum;
    }
}
