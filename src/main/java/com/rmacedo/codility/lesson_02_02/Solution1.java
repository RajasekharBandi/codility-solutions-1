package com.rmacedo.codility.lesson_02_02;


public class Solution1 implements SolutionInterface {

    public static void main(String... args) {

    }

    @Override
    public int[] solution(int[] A, int K) {
        int[] response = new int[A.length];

        try {
            int pos = -1;
            if (K > A.length) {
                K = K % A.length;
            }

            for (int i = 0; i < A.length; i++) {

                if ((i + K) > A.length - 1) {
                    pos = Math.abs(A.length - K - i);
                } else {
                    pos = i + K;
                }
                response[pos] = A[i];
            }
        } catch (Exception e) {
            return response;
        }


        return response;
    }
}
