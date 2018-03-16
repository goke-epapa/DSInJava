package me.adegokeobasa.dsinjava.codility.lessonsix;

import java.util.Arrays;

/**
 * Created by epapa on 16/03/2018.
 */
public class Distinct {

    public static void main(String[] args) {
        System.out.println(new Distinct().solution(new int[]{2, 1, 1, 2, 3, 1}));
    }

    public int solution(int[] A) {
        Arrays.sort(A);

        if (A.length < 1) {
            return A.length;
        }

        int distinct = 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                distinct++;
            }
        }
        return distinct;
    }
}
