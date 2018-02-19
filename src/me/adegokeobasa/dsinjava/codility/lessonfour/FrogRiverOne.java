package me.adegokeobasa.dsinjava.codility.lessonfour;

import java.util.Arrays;

/**
 * Created by epapa on 16/02/2018.
 */
public class FrogRiverOne {
    public static void main(String[] args) {
//        System.out.println(new FrogRiverOne().solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        System.out.println(new FrogRiverOne().solution(5, new int[]{1, 5, 1, 4, 4, 3, 5, 2}));
        System.out.println(new FrogRiverOne().solution(5, new int[]{3}));
        System.out.println(new FrogRiverOne().solution(2, new int[]{1, 1, 1, 1}));
        System.out.println(new FrogRiverOne().solution(2, new int[]{2, 2, 2, 2, 2}));
    }

    public int solution(int X, int[] A) {
        int holes[] = new int[X];
        if (A.length < X) {
            return -1;
        }
        int highestIntegerFound = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X && holes[A[i] - 1] == 0) {
                holes[A[i] - 1] = i;
            }
            if (A[i] > highestIntegerFound) {
                highestIntegerFound = A[i];
            }
        }
        if (holes[X - 1] == -1 || highestIntegerFound < X) {
            return -1;
        }

        int max = 0;
        for (int hole : holes) {
            if (hole > max) {
                max = hole;
            }
        }
        return max;
    }
}
