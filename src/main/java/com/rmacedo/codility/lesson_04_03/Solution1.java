package com.rmacedo.codility.lesson_04_03;

import java.util.HashMap;
import java.util.Map;

public class Solution1 implements SolutionInterface {

    public static void main(String... args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(s.solution(new int[]{1, 2, 3}));
        System.out.println(s.solution(new int[]{-1, -3}));
    }

    @Override
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : A) {
            if (map.get(new Integer(i)) == null) {
                map.put(new Integer(i), 1);
            } else {
                map.put(new Integer(i), map.get(new Integer(i)) + 1);
            }
        }
        int c = 1;
        while (map.get(new Integer(c)) != null) {
            c++;
        }
        return c;
    }
}
