package com.rmacedo.codility.lesson_04_01;

import java.util.Arrays;

public class Solution1 implements SolutionInterface{

    public static void main (String... args){
        Solution1 s = new Solution1();
        System.out.println(s.solution(new int[]{2, 3, 1, 5}));
        System.out.println(s.solution(new int[]{}));
        System.out.println(s.solution(new int[]{1}));
        System.out.println(s.solution(new int[]{2}));
    }
    @Override
    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0 ; i < A.length ; i++){
            if (i+1 != A[i]) return 0;
        }

        return 1;
    }
}
