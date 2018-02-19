package me.adegokeobasa.dsinjava.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by epapa on 19/02/2018.
 */
public class ArrayRotate {

    public static void main(String[] args) {
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(input));
        new ArrayRotate().rotate(input);
        System.out.println(Arrays.deepToString(input));
    }

    public void rotate(int[][] matrix) {
        int[][] copy = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, copy[i], 0, matrix[i].length);
        }

        int len = matrix.length;
        int i = 0;
        for (int swapJ = 0; swapJ < len; swapJ++) {
            int j = -1;
            for (int swapI = len - 1; swapI >= 0; swapI--) {
                j++;
                matrix[i][j] = copy[swapI][swapJ];
            }
            i++;
        }
    }
}
