package com.rmacedo.codility.challenges.challenge02;

public class Solution01 implements SolutionInterface {
    public static void main(String... args){
        Solution01 s = new Solution01();
        System.out.println(s.solution(955));
        System.out.println(s.solution(1651));
        System.out.println(s.solution(102));
        System.out.println(s.solution(1));
        System.out.println(s.solution(16));
        System.out.println(s.solution(23));
        System.out.println(s.solution(12));

    }

    @Override
    public int solution(int n) {
        int[] d = new int[30];
        int l = 0;
        int p;
        while (n > 0) {
            d[l] = n % 2;
            n /= 2;
            l++;
        }
        for (p = 1; p < l; ++p) {
            if (p > l / 2) continue; int i;
                boolean ok = true;
                for (i = 0; i < l - p; ++i) {
                    if (d[i] != d[i + p]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    return p;
                }

        }
        return -1;
    }
}
