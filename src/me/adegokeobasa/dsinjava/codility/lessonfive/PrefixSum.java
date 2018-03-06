package me.adegokeobasa.dsinjava.codility.lessonfive;

import java.util.Arrays;

/**
 * Created by epapa on 06/03/2018.
 */
public class PrefixSum {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(new PrefixSum().prefixSum(arr)));
        System.out.println(new PrefixSum().totalOfSlice(arr, 2, 5));
    }

    public int[] prefixSum(int[] A) {
        int prefixSum[] = new int[A.length + 1];
        for (int i = 1; i <= A.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + A[i - 1];
        }
        return prefixSum;
    }

    public int totalOfSlice(int[] A, int a, int b) {
        if (a < 0 || a > b) {
            throw new IllegalArgumentException("a is out of bounds");
        }
        if (b > A.length + 1 || b < a) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return prefixSum(A)[b + 1] - A[a];
    }
}
