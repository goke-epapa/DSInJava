package me.adegokeobasa.dsinjava.codility.lessonseven;

import java.util.Stack;

/**
 * Created by epapa on 23/03/2018.
 */
public class StoneWall {

    public static void main(String[] args) {
        System.out.println(new StoneWall().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 1}));
        System.out.println(new StoneWall().solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}));
        System.out.println(new StoneWall().solution(new int[]{5, 8, 9, 4, 4, 1}));
        System.out.println(new StoneWall().solution(new int[]{2, 5, 1, 4, 6, 7, 9, 10, 1}));
    }

    public int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < H.length; i++) {
            int h = H[i];

            // Pop until last element in stack greater or equals current element
            while (!stack.isEmpty() && h < stack.peek()) {
                stack.pop();
            }
            // Stack is empty add height and increment count
            if (stack.isEmpty()) {
                stack.push(h);
                count++;
            }
            // From Low to High
            else if (h > stack.peek()) {
                stack.push(h);
                count++;
            }
        }
        return count;
    }
}
