package me.adegokeobasa.dsinjava.codility.lessonsix;

import java.util.Arrays;

/**
 * Created by epapa on 16/03/2018.
 */
public class Triangle {

    public static void main(String[] args) {
        System.out.println(new Triangle().solution(new int[]{10, 2, 5, 1, 8, 20}));
        System.out.println(new Triangle().solution(new int[]{10, 50, 5, 1}));
        System.out.println(new Triangle().solution(new int[]{5, 3, 3}));
        System.out.println(new Triangle().solution(new int[]{5}));
    }

    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i <= A.length - 3; i++) {
            long P = A[i];
            long Q = A[i + 1];
            long R = A[i + 2];

            if ((P + Q > R) && (Q + R > P) && (R + P > Q)) {
                return 1;
            }
        }

        return 0;
    }
}
