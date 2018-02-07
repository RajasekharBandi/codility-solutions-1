package com.rmacedo.codility.lesson_04_02;

import java.util.HashSet;

public class Solution1 implements SolutionInterface {

    public static void main(String... args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }

    @Override
    public int solution(int X, int[] A) {

        HashSet<Integer> positions = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (positions.contains(A[i])) continue;

            positions.add(A[i]);
            if (positions.size() == X) return i;
        }

        return -1;
    }
}
