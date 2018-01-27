package me.adegokeobasa.dsinjava.codility;

import java.util.Arrays;

/**
 * Created by epapa on 27/01/2018.
 */
public class CyclicRotation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CyclicRotation().solution(new int[]{3, 8, 9, 7, 6}, 6)));
    }

    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        if (A.length == 0 || K % A.length == 0) {
            return A;
        }

        if (K > A.length) {
            K = K % A.length;
        }

        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int j = (i + K) % A.length;
            result[j] = A[i];
        }
        return result;
    }
}
