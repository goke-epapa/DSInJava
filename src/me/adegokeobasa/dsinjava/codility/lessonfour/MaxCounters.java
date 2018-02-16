package me.adegokeobasa.dsinjava.codility.lessonfour;

import java.util.Arrays;

/**
 * Created by epapa on 16/02/2018.
 */
public class MaxCounters {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MaxCounters().solution(5, new int[]{1, 6, 4, 5, 6, 4, 6, 1, 5, 6, 1, 2, 6, 3, 3, 6})));
    }

    /**
     * 100% Solution
     * @param N
     * @param A
     * @return
     */
    public int[] solution(int N, int[] A) {
        int[] output = new int[N];

        int maxCounter = 0;
        int maxArrayValue = 0;
        boolean maxCounterLast = false;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != N + 1) {
                maxCounterLast = false;
                output[A[i] - 1] = max(output[A[i] - 1], maxCounter);
                output[A[i] - 1] = output[A[i] - 1] + 1;
                maxArrayValue = max(output[A[i] - 1], maxArrayValue);
            } else {
                // Max Counters
                if (!maxCounterLast) {
                    maxCounter = maxArrayValue;
                }
                maxCounterLast = true;
            }
        }

        for (int i = 0; i < N; i++) {
            output[i] = max(output[i], maxCounter);
        }
        return output;
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    /**
     * Too Slow
     * @param N
     * @param A
     * @return
     */
    public int[] solution1(int N, int[] A) {
        int[] output = new int[N];

        int maxArrayValue = 0;
        boolean maxCounterLast = false;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != N + 1) {
                maxCounterLast = false;
                output[A[i] - 1] = (output[A[i] - 1] + 1);
                if (output[A[i] - 1] > maxArrayValue) {
                    maxArrayValue = output[A[i] - 1];
                }
            } else {
                // Max Counters
                if (!maxCounterLast) {
                    Arrays.fill(output, maxArrayValue);
                }
                maxCounterLast = true;
            }
        }
        return output;
    }
}
