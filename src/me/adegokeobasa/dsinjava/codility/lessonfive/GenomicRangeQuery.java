package me.adegokeobasa.dsinjava.codility.lessonfive;

import java.util.Arrays;

/**
 * Created by epapa on 08/03/2018.
 */
public class GenomicRangeQuery {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new GenomicRangeQuery().solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(new GenomicRangeQuery().solution("AAAAAA", new int[]{2, 5, 0}, new int[]{4, 5, 5})));
    }

    public int[] solution(String S, int[] P, int[] Q) {
        int prefixSum[][] = new int[S.length() + 1][4];

        for (int i = 0; i < 4; i++) {
            prefixSum[0][i] = 0;
        }
        for (int i = 1; i < S.length() + 1; i++) {
            for (int j = 0; j < 4; j++) {
                int nucleotideValue = 0;
                switch (S.charAt(i - 1)) {
                    case 'A':
                        nucleotideValue = 0;
                        break;
                    case 'C':
                        nucleotideValue = 1;
                        break;
                    case 'G':
                        nucleotideValue = 2;
                        break;
                    case 'T':
                        nucleotideValue = 3;
                        break;
                }
                prefixSum[i][j] += prefixSum[i - 1][j];
                if (nucleotideValue == j) {
                    prefixSum[i][j]++;
                }
            }
        }

        int[] minimalImpactFactors = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int a = P[i];
            int b = Q[i];

            for (int j = 0; j < 4; j++) {
                if (prefixSum[b + 1][j] - prefixSum[a][j] > 0) {
                    minimalImpactFactors[i] = j + 1;
                    break;
                }
            }
        }

        return minimalImpactFactors;
    }
}
