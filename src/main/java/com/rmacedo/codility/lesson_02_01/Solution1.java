package com.rmacedo.codility.lesson_02_01;


import java.util.HashSet;

public class Solution1 implements SolutionInterface {
    public static void main(String... args) {
        Solution1 solution1 = new Solution1();
        System.out.println("Size " + solution1.solution(new int[]{3, 2, 2, 9, 3, 9, 7}));
    }

    @Override
    public int solution(int[] A) {
        HashSet<Integer> items = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (items.contains(A[i])) {
                items.remove(A[i]);
            } else {
                items.add(A[i]);
            }
        }

        int itemToReturn = -1;
        for (Integer a : items) {
            itemToReturn = a;
        }
        return itemToReturn;
    }
}
