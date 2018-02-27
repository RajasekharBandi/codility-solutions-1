package com.rmacedo.codility.challenges.challenge01;

public class Solution01 implements SolutionInterface {
    public static void main(String... args) {
        Solution01 solution01 = new Solution01();
        System.out.println(solution01.solution(123456));
        System.out.println(solution01.solution(130));
        System.out.println(solution01.solution(1));
        System.out.println(solution01.solution(12));
        System.out.println(solution01.solution(123456));
    }

    @Override
    public int solution(Integer A) {
        String value = A.toString();

        if (value.length() == 1) return A;

        String result = "";
        int w = value.length() - 1;
        int i = 0;
        while (i <= w) {
            result += value.charAt(i++);
            if (i > w) break;
            result += value.charAt(w--);
        }

        return Integer.parseInt(result);
    }
}
