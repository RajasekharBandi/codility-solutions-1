package com.rmacedo.codility.lesson_01;

public class Solution1 implements SolutionInterface {

    public static void main(String... args) {
        Solution1 solution1 = new Solution1();

        System.out.println("Size " + solution1.solution(1041));
        System.out.println("Size " + solution1.solution(20));
        System.out.println("Size " + solution1.solution(1024));
        System.out.println("Size " + solution1.solution(2147483647));
        System.out.println("Size " + solution1.solution(51712));


    }

    @Override
    public int solution(int N) {
        int maxSize = 0;

        String binaryString = Integer.toBinaryString(N);
        String[] list = binaryString.split("1");

        if (list.length == 0) return maxSize;
        int correction = binaryString.endsWith(list[list.length - 1]) ? 1 : 0;


        for (int i = 0; i < list.length - correction; i++) {
            if (list[i].length() > maxSize) {
                maxSize = list[i].length();
            }
        }

        return maxSize;
    }
}
