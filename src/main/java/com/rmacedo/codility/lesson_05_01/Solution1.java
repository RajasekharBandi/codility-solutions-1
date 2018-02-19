package com.rmacedo.codility.lesson_05_01;

public class Solution1 implements SolutionInterface {
    @Override
    public int solution(int A, int B, int K) {
        int first = A % K == 0 ? A : A + (K - A % K);
        int last = B % K == 0 ? B : B - B % K; //B/K behaves this way by default.
        return (last - first) / K + 1;
    }
}
