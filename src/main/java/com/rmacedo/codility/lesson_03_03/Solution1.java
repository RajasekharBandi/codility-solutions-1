package com.rmacedo.codility.lesson_03_03;

import java.util.Arrays;

public class Solution1 implements SolutionInterface {

    public static void main(String... args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution(new int[]{2, 3, 1, 5}));
        System.out.println(s.solution(new int[]{}));
        System.out.println(s.solution(new int[]{1}));
        System.out.println(s.solution(new int[]{2}));

    }

    @Override
    public int solution(int[] A) {
        if (A.length == 0) return 1;
        Arrays.sort(A);
        int i = 0;

        while (i < A.length) {
            if (i + 1 != A[i]) return i + 1;
            i++;
        }

        if (A[i-1] != i + 1) {
            return i+1;
        }
        return 1;
    }
}
