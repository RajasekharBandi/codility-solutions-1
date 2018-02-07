package com.rmacedo.codility.lesson_03_02;

public class Solution1 implements SolutionInterface {

    public static void main(String... args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution(10, 85, 30));
        System.out.println(solution1.solution(1, 5, 2));
        System.out.println(solution1.solution(1, 1, 3));
    }

    @Override
    public int solution(int x, int y, int d) {
        if (x == y) return 0;

        int dist = y - x;

        int response = (dist / d);
        return response  * d == dist ? response : response + 1;
    }
}
